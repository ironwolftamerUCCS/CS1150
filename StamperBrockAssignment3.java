import java.awt.im.InputContext;
import java.security.PublicKey;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class StamperBrockAssignment3 {
	
	// Instantiating 
	// Smoothie prices
	public static final double BerryBananaPrice = 7.5;
	public static final double TropicalPrice = 6.75;
	public static final double GreenJoltPrice = 5;
	
	// Add-In prices
	public static final double AlmondButterPrice = 1.5;
	public static final double LimeJuicePrice = 1.5;
	
	// Tax rate
	public static final double TaxRate = 8.25/100;

	public static void main(String[] args) {
		//Assignment instructions
		/* 
		 * 1. Add this assignment to your project called CS1150
		 * 2. Create a Java class within that project called LastNameFirstNameAssignment3
		 * 3. Follow "CS1150 Programming Assignments Policy"
		 *		a. Using proper indentation, follow naming conventions, commenting code, etc.
		 * 		b. Create design notebook with the required sections. See example posted on Canvas.
		 * 4. Use correct data types and constants where possible
		 * 		• Use constants for numeric values that will not change while code runs.
		 * 		• For example, use constants for smoothie prices, tax rate, menu selection numbers, etc.
		 * 		EX: final double BERRY_BANANA_PRICE = 7.50;
		 * 		EX: final double TAX_RATE = 8.25/100;
		 * 5. Write code in main that:
		 * 		• Displays a menu with the different types of smoothies
		 * 		• Prompts user for:
		 * 			o Type of smoothie
		 * 			o If any add-in is wanted
		 * 		• Displays
		 * 			o Cost for the smoothie ordered,
		 * 			o Cost for add-in,
		 * 			o Taxes,
		 * 			o Total cost
		 * 6. The code must handle invalid user selections for:
		 * 		• Smoothie selection in the menu
		 * 			o If an invalid smoothie option is entered in the menu, MUST print message and END PROGRAM
		 * 		• Add-in selection in the menu
		 * 			o If invalid add-in option is entered in the menu, MUST print message and END PROGRAM
		 * 		• Note:
		 * 			o End program means: once an input error occurs, the program must display an error message and perform no more processing. For example:
		 * 				§ If the user enters 0 when asked to select a smoothie, the program must display an error message and complete execution.
		 * 				§ At this point, your code must NOT present the add-in menu or ask the user for an add-in option.
		 * 				§ See output example #3 below.
		 * 			o Use NESTED IF statements to make this happen properly.
		 * 				§ DO NOT use System.exit(0) to exit program if error occurs
		 * 				§ DO NOT use break or return statements if error occurs
		 * 				§ The purpose of this assignment is to learn to properly use nested if-statements so using System.exit(0), break, returns may result in a 0 on correctness grade.
		 */
		Scanner input = new Scanner(System.in);
		
		// Print smoothie table
		PrintOutSmoothieSelection();
		
		// Prompt user input for smoothie selection
		System.out.print("\nPlease enter your selection: ");
		
		// Instantiate vars
		int userSmoothieOption = -1;
		int userAddInOption = -1;
		String userAddInOptionString = null;
		
		// Get user input
		String userSmoothieOptionString = input.next();
		
		// Convert the input to an integer
		userSmoothieOption = Integer.parseInt(userSmoothieOptionString);
		
		// Make sure the input is within a valid range
		if (0 >= userSmoothieOption || userSmoothieOption > 3) {
			// Give an error since the input was out of range
			System.out.println("\n" + userSmoothieOption + " is not a valid option. Run the program again and please enter a value between 1 and 3 inclusive.");
		
		}
		else {
			// Print smoothie add-in table
			System.out.println();
			PrintOutAddInSelection();
			
			// Prompt user input for add-in selection
			System.out.print("\nPlease enter your selection: ");
			
			// Get user input
			userAddInOptionString = input.next();
			
			// Convert the user input to an integer
			userAddInOption = Integer.parseInt(userAddInOptionString);
			
			// Make sure the input is within the valid range
			if (0 >= userAddInOption || userAddInOption > 2) {
				// Give an error since the input was out of range
				System.out.println("\n" + userAddInOption + " is not a valid option. Run the program again and please enter a value between 0 and 2 inclusive.");
			
			}
			else {
				// Print out the total price
				System.out.println();
				CalculateAndPrintTotalPrice(userSmoothieOption, userAddInOption);
			}
		}
	}
	
	// Method to print out the smoothie selection table
	public static void PrintOutSmoothieSelection() {
		// Smoothie option table
		System.out.printf("%-7s %-14s %-5s%n", "Option", "Type", "Price");
		System.out.println("--------------------------------");
		System.out.printf("%-7s %-14s %1s%-4.2f%n", "1", "Berry Banana", "$", BerryBananaPrice);
		System.out.printf("%-7s %-14s %1s%-4.2f%n", "2", "Tropical", "$", TropicalPrice);
		System.out.printf("%-7s %-14s %1s%-4.2f%n", "3", "Green Jolt", "$", GreenJoltPrice);
	}
	
	// Method to print out the smoothie add-in table
	public static void PrintOutAddInSelection() {
		// Add-In table
		System.out.printf("%-7s %-14s %-5s%n", "Option", "Add-In", "Price");
		System.out.println("--------------------------------");
		System.out.printf("%-7s %-14s %n", "0", "None");
		System.out.printf("%-7s %-14s %1s%-4.2f%n", "1", "Almond Butter", "$", AlmondButterPrice);
		System.out.printf("%-7s %-14s %1s%-4.2f%n", "2", "Lime Juice", "$", LimeJuicePrice);
	}
	
	// Method that calculates total price of the selections
	public static void CalculateAndPrintTotalPrice(int smoothieOption, int addInOption) {
		// Instantiate the total price
		double totalPrice = 0;
		String smoothieOptionString = "default";
		String addInOptionString = "default";
		
		// Determine which smoothie option was picked 1 = Berry Banana, 2 = Tropical, 3 = Green Jolt
		switch (smoothieOption) {
		case 1: totalPrice += BerryBananaPrice;
				smoothieOptionString = "Berry Banana Smoothie";
			break;
		case 2: totalPrice += TropicalPrice;
				smoothieOptionString = "Tropical Smoothie";
			break;
		case 3: totalPrice += GreenJoltPrice;
				smoothieOptionString = "Green Jolt Smoothie";
			break;
		}
		
		// Print out smoothie option for the "receipt"
		System.out.println("--------------------------------");
		System.out.printf("%-25s %1s%-4.2f%n", smoothieOptionString, "$", totalPrice);
		
		// Determine which add-in option was picked 1 = Almond Butter, 2 = Lime Juice, 0 is an option but nothing happens so default was added
		// Note about the printf in this statement vs the previous block. I chose to put the printfs directly in this switch for 2 reasons. 1 I can't use total price like I did previously
		// 2 It save a bit of programming in the long run. 3 it allows me to weed out the 0 option w/o having to use an if statement
		switch (addInOption) {
		case 1: System.out.printf("%-25s %1s%-4.2f%n", "Almond Butter", "$", AlmondButterPrice);
			totalPrice += AlmondButterPrice;
			break;
		case 2: System.out.printf("%-25s %1s%-4.2f%n", "Lime Juice", "$", LimeJuicePrice);
			totalPrice += LimeJuicePrice;
			break;
		default: break;
		}
		
		// Calculate Tax
		double taxAmount = totalPrice * TaxRate;
		
		// Add tax to total
		totalPrice += taxAmount;
		
		// Print out tax and total price
	    System.out.printf("%-25s %1s%-4.2f%n", "Tax", "$", taxAmount);
		System.out.println("--------------------------------");
	    System.out.printf("%-25s %1s%-4.2f%n", "Total", "$", totalPrice);


	}

}
