import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class StamperBrockAssignment2 {

	public static void main(String[] args) {
		// Assignment specifications
		/*
		* 1. Add this assignment to the CS1150 project you created for assignment #1.
		* 2. Create a new Java class within your CS1150 project called LastNameFirstNameAssignment2
		* 	a. Right click on your CS1150 project and select File->New->Class
		* 
		* 3. The following modules on Canvas contain several helpful documents:
		*	a. Programming Assignments Policy for help with assignment requirements.
		*		i. Follow the "CS1150 Programming Assignments Policy" on all assignments.
		*		ii. Document, format, follow naming conventions, comment code, etc.
		*	b. Design Notebook for help with design notebook.
		*		i. The document Design Notebook Example is an example design notebook for
		*		this assignment.
		*
		* 4. Write a program that shows the wind chill for each location by doing the following:
		*	a. Create a constant for the exponent in the formula which is always 0.16
		*		i. You can include other constants if you like.
		*	b. Prompt (i.e. ask) the user for these specific details for EACH LOCATION:
		*		i. Name of the location (DO NOT include spaces in the name – more on this later)
		*		ii. Wind speed in mph
		*		iii. Temperature in Fahrenheit
		*	c. Display a nicely formatted table that shows the following details for EACH LOCATION:
		*		i. Location name
		*		ii. Wind speed
		*		iii. Temperature in Fahrenheit
		*		iv. Wind Chill in Fahrenheit
		*		v. Temperature in Celsius
		*		vi. Wind Chill in Celsius
		*	b. Calculate and display the following differences for the 2 locations:
		*		i. Wind speed
		*		ii. Temperature in Fahrenheit
		*		iii. Wind Chill in Fahrenheit
		*		iv. Temperature in Celsius
		*		v. Wind Chill in Celsius
		*/
		
		// Get input from the user
		// Instantiate scanner object
		Scanner input = new Scanner(System.in);
		
		// Get the first location's name
		System.out.print("Please enter name of 1st location: ");
		String nameOfFirstLocation = input.next();
		
		// Get the first location's wind speed
		System.out.print("Please enter the 1st location's wind speed: ");
		double firstLocationWindSpeed = Double.parseDouble(input.next());
		
		// Get the first location's temperature in Fahrenheit
		System.out.print("Please enter the 1st location's temperature in Fahrenheit: ");
		double firstLocationTemperatureInFahrenheit = Double.parseDouble(input.next());
		
		// Get the second location's name
		System.out.print("Please enter name of 2nd location: ");
		String nameOfSecondLocation = input.next();
		
		// Get the second location's wind speed
		System.out.print("Please enter the 2nd location's wind speed: ");
		double secondLocationWindSpeed = Double.parseDouble(input.next());
		
		// Get the second location's temperature in Fahrenheit
		System.out.print("Please enter the 2nd location's temperature in Fahrenheit: ");
		double secondLocationTemperatureInFahrenheit = Double.parseDouble(input.next());
		
		// Close input object
		input.close();
		
		// Calculate the wind chill in Fahrenheit
		double firstLocationWindChillInFahrenheit = CalculateWindChill(firstLocationTemperatureInFahrenheit, firstLocationWindSpeed);
		double secondLocationWindChillInFahrenheit = CalculateWindChill(secondLocationTemperatureInFahrenheit, secondLocationWindSpeed);
		
		// Convert temperature in Fahrenheit to Celsius
		double firstLocationTemperatureInCelsius = ConvertFahrenheitToCelsius(firstLocationTemperatureInFahrenheit);
		double secondLocationTemperatureInCelsius = ConvertFahrenheitToCelsius(secondLocationTemperatureInFahrenheit);
		
		// Convert wind chill in Fahrenheit to Celsius
		double firstLocationWindChillInCelsius = ConvertFahrenheitToCelsius(firstLocationWindChillInFahrenheit);
		double secondLocationWindChillInCelsius = ConvertFahrenheitToCelsius(secondLocationWindChillInFahrenheit);
		
		// Find the difference in temperature between location 1 and 2
		double temperatureDifferenceInFahrenheit = Math.abs(secondLocationTemperatureInFahrenheit - firstLocationTemperatureInFahrenheit);
		double temperatureDifferenceInCelsius = Math.abs(secondLocationTemperatureInCelsius - firstLocationTemperatureInCelsius);
		
		// Find the difference in wind speed between location 1 and 2
		double windSpeedDifference = Math.abs(secondLocationWindSpeed - firstLocationWindSpeed);
		
		// Find the difference in wind chill between location 1 and 2
		double windChillDifferenceInFahrenheit = Math.abs(secondLocationWindChillInFahrenheit - firstLocationWindChillInFahrenheit);
		double windChillDifferenceInCelsius = Math.abs(secondLocationWindChillInCelsius - firstLocationWindChillInCelsius);
		
		// Output table that is formatted according to the specs document
		// Table header
		System.out.println();
		System.out.println("***********************************************************************************************");
		System.out.printf("%-35s %21s %35s%n", " ", "Wind Chill Calculator", " ");
		System.out.println("***********************************************************************************************");
		
		// Table Column names
		System.out.println();
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Location", "Wind Speed", "Temperature(F)", "Wind Chill(F)", "Temperature(C)", "Wind Chill(C)");
		System.out.println("-----------------------------------------------------------------------------------------------");
	
		// Location statistics
		System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f%n", nameOfFirstLocation, firstLocationWindSpeed, firstLocationTemperatureInFahrenheit, firstLocationWindChillInFahrenheit, firstLocationTemperatureInCelsius, firstLocationWindChillInCelsius);
		System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f%n", nameOfSecondLocation, secondLocationWindSpeed, secondLocationTemperatureInFahrenheit, secondLocationWindChillInFahrenheit, secondLocationTemperatureInCelsius, secondLocationWindChillInCelsius);
		System.out.println("-----------------------------------------------------------------------------------------------");

		// Difference in statistics
		System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f%n", "Differences", windSpeedDifference, temperatureDifferenceInFahrenheit, windChillDifferenceInFahrenheit, temperatureDifferenceInCelsius, windChillDifferenceInCelsius);

	}
	
	// Method that converts a given temperature that is in Fahrenheit to Celsius
	// Parameters: 
	// temperatureInFahrenheit - the temperature you want to convert in Fahrenheit
	public static double ConvertFahrenheitToCelsius(double temperatureInFahrenheit) {
		double convertedTempurature = (temperatureInFahrenheit - 32) * 5/9;
		return convertedTempurature;
	}
	
	// Method that calculates the wind speed given a temperature in Fahrenheit and a wind speed
	// Parameter:
	// temperatureInFahrenheit - the current temperature in Fahrenheit
	// windSpeed - the current wind speed in mph
	public static double CalculateWindChill(double temperatureInFahrenheit, double windSpeed) {
		final double ExponantValue = 0.16;
		double windChill = 35.74 + 0.6215 * temperatureInFahrenheit - 35.75 * Math.pow(windSpeed, ExponantValue) + 0.4275 * temperatureInFahrenheit * Math.pow(windSpeed, ExponantValue);
		return windChill;
	}

}
