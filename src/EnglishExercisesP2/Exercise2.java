package EnglishExercisesP2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);
		
		// age as int
        int age;
        // current year as int
        int year;

        // Display program title
        System.out.println("=== Birth Year Calculator ===");

        // Display prompt for age
        System.out.print("Enter your age: ");
        // Save age
        age = sc.nextInt();

        // Display prompt for current year
        System.out.print("Enter the current year: ");
        // Save current year
        year = sc.nextInt();

        // Calculate birth year
        year -= age;

        // Display birth year
        System.out.println("You were born in: " + year);

        // Close the scanner
        sc.close();

	}

}
