package EnglishExercisesP2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
        // Create Scanner
        Scanner sc = new Scanner(System.in);
        
        // price as double
        double price;
        // tax as double
        double tax;
        
		// Display program title
        System.out.println("=== Price Calculator ===");

        // Display prompt for price
        System.out.print("Enter the price: ");
        // Save price
        price = sc.nextDouble();

        // Display prompt for tax
        System.out.print("Enter the tax percentage: ");
        // Save tax
        tax = sc.nextDouble();

        // Calculate the new price
        price *= (1 + tax / 100);

        // Display new price
        System.out.println("The final price with tax is: " + price);

        // Close the scanner
        sc.close();
	}

}
