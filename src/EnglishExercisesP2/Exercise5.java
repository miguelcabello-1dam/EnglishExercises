package EnglishExercisesP2;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // weight as double
        double weight;
        // height as double
        double height;
        // bmi as double
        double bmi;

        // Display program title
        System.out.println("=== BMI Calculator ===");

        // Prompt for weight
        System.out.print("Enter your weight in kilograms: ");
        // Save weight
        weight = sc.nextDouble();

        // Prompt for height
        System.out.print("Enter your height in meters: ");
        // Save height
        height = sc.nextDouble();

        // Calculate BMI
        bmi = weight / (height * height);

        // Display BMI
        System.out.println("Your BMI is: " + bmi);

        // Close the scanner
        sc.close();
    }
}
