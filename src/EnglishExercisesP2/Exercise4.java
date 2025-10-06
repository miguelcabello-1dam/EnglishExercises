package EnglishExercisesP2;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // pounds as double
        double pounds;
        // kilos as double
        double kilos;

        // Display program title
        System.out.println("=== Pounds to Kilos Converter ===");

        // Prompt for value in pounds
        System.out.print("Enter the value in pounds: ");
        // Enter value in pounds
        pounds = sc.nextDouble();

        // Convert to kilos
        kilos = pounds / 2.2;

        // Display value in kilos
        System.out.println("The value in kilos is: " + kilos);

        // Close the scanner
        sc.close();
    }
}
