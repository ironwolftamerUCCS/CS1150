/*
* Name: Brock Stamper
* Class: CS1150
* Section: 1
* Due: Aug 31, 2023
* Description: Assignment #1
* This program demonstrates that I understand basic program structure by
* printing a couple paragraphs that tell the instructor what I’m passionate
* about. It also gives a little practice with arithmetic in Java.
*/

import java.io.*;
import static java.lang.Math.*;

public class StamperBrockAssignement1 {

	public static void main(String[] args) {
		//Part 1: Displaying Output
		/* 
		* Add code to the main method that prints sentences about yourself. Some ideas: what you’re passionate
		* about, what degree you’re working on, favorite hobbies, favorite movies, where you like to travel, etc.
		* 
		* a. Include at least 2 but not more than 3 paragraphs.
		* b. Each paragraph should have 5 to 10 sentences.
		* c. Indent the 1st sentence in each paragraph by a few spaces.
		* d. Each printed line should be about the same length. 
		*/
		
		// Indicator for part 1 for assignment 1 with a dashed line separator
		System.out.println("Part 1 \n--------");
		
		// 2 paragraphs about me. Each one starts with a tab and I added line breaks to allow make them more legible in the console window.
		System.out.println("\tMy name is Brock Stamper and I am pursuing a BI in cyber security.\n"
				+ "I love to solve problems and spend a lot of my free time playing video games \n"
				+ "and going out with friends. Right now I am addicted to Baldur's Gate III and \n"
				+ "have spent a couple of nights playing way too much of it. I also have a love \n"
				+ "for Japan and love learning about their culture, customs, politics, and all \n"
				+ "sorts of other things. I am also getting minors in game design and development\n"
				+ "and Japanese. I love learning the language and hope that I can incorperate it\n"
				+ "into my professional life.\n"
				+ "\tI have also been well travelled due to my parents being in the military most\n"
				+ "of my life. My mom served briefly in the army and my dad retired from the army\n"
				+ "as a master sergeant. I have lived in North Carolina, Texas, Minnesota, Arizona,\n"
				+ "Germany, and was even born in Okinawa, Japan. Other than living in all those \n"
				+ "places I have also visited France, England, Italy, Austria, Japan, Vietnam, and\n"
				+ "couple of other places. I love to travel and hope to visit even more places and\n"
				+ "revisit places in the future. I would love to go back to Europe and experience\n"
				+ "the places I've been for a second time and go to a few new places as well. I will\n"
				+ "probably also frequent Japan, if just to only keep up on my language skills.");
		
		// Separator to to separate part 1 and 2
		System.out.println();
		
		//Part 2: Working with Expressions
		/*
		* Add code immediately following part 1 to convert US dollars to Mexican Pesos, British pounds, and
		* Canadian dollars.
		* 
		* a. Convert $1, $5, $10, $20, $50, and $100 using the formulas:
		* 	i. $1 US dollar = 18.80 Mexican Pesos (MXN)
		* 	ii. $1 US dollar = 0.77 British Pounds (GBP)
		* 	iii. $1 US dollar = 1.30 Canadian Dollars (CAD)
		* 
		* b. Create a table of values using print statements and spaces that looks like this table:
		* Dollars Pesos Pounds Canadian
		* -------------------------------------
		* $1 18.8 0.77 1.3
		* $5 94.0 3.85 6.5
		* $10 188.0 7.7 13.0
		* $20 376.0 15.4 26.0
		* $50 940.0 38.5 65.0
		* $100 1880.0 77.0 130.0
		*/
		
		// Indicator for part 2 for assignment 1 with a dashed line separator
		System.out.println("Part 2 \n--------");

		System.out.printf("%-10s %-10s %-10s %-10s%n", "Dollars", "Pesos", "Pounds", "Canadian");
		System.out.printf("-------------------------------------------%n");

		System.out.printf("%-10s %-10.1f %-10.1f %-10.1f%n", "$" + 1, ConvertDollarsToPesos(1), ConvertDollarsToPounds(1), ConvertDollarsToCanadian(1));
		System.out.printf("%-10s %-10.1f %-10.1f %-10.1f%n", "$" + 5, ConvertDollarsToPesos(5), ConvertDollarsToPounds(5), ConvertDollarsToCanadian(5));
		System.out.printf("%-10s %-10.1f %-10.1f %-10.1f%n", "$" + 10, ConvertDollarsToPesos(10), ConvertDollarsToPounds(10), ConvertDollarsToCanadian(10));
		System.out.printf("%-10s %-10.1f %-10.1f %-10.1f%n", "$" + 20, ConvertDollarsToPesos(20), ConvertDollarsToPounds(20), ConvertDollarsToCanadian(20));
		System.out.printf("%-10s %-10.1f %-10.1f %-10.1f%n", "$" + 50, ConvertDollarsToPesos(50), ConvertDollarsToPounds(50), ConvertDollarsToCanadian(50));
		System.out.printf("%-10s %-10.1f %-10.1f %-10.1f%n", "$" + 100, ConvertDollarsToPesos(100), ConvertDollarsToPounds(100), ConvertDollarsToCanadian(100));
		
		System.out.printf("%+10s", "Hello");
	}
	
	// Method to convert a given dollar amount to Pesos
	// Parameters: "dollarAmountToPesos" (float) - The dollar amount you want to convert into Pesos
	public static float ConvertDollarsToPesos(float dollarAmountToConvert) 
	{
		float convertedValue;
		convertedValue = dollarAmountToConvert * 18.80f;
		return convertedValue;
	}
	
	// Method to convert a given dollar amount to British Pounds
	// Parameters: "dollarAmountToPesos" (float) - The dollar amount you want to convert into British Pounds
	public static float ConvertDollarsToPounds(float dollarAmountToConvert) 
	{
		float convertedValue;
		convertedValue = dollarAmountToConvert * 0.77f;
		return convertedValue;
	}
	
	// Method to convert a given dollar amount to Canadian Dollars
	// Parameters: "dollarAmountToPesos" (float) - The dollar amount you want to convert into Canadian Dollars
	public static float ConvertDollarsToCanadian(float dollarAmountToConvert) 
	{
		float convertedValue;
		convertedValue = dollarAmountToConvert * 1.30f;
		return convertedValue;
	}

}
