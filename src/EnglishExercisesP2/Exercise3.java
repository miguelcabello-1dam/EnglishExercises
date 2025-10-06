package EnglishExercisesP2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // length as double
        double length;
        // height as double
        double height;
        // area as double
        double area;
        // perimeter as double
        double perimeter;

        // Display program title
        System.out.println("=== Rectangle Area and Perimeter ===");

        // Display prompt for length
        System.out.print("Enter the length of the rectangle: ");
        // Save length
        length = sc.nextDouble();

        // Display prompt for height
        System.out.print("Enter the height of the rectangle: ");
        // Save height
        height = sc.nextDouble();

        // Calculate area
        area = length * height;
        // Calculate perimeter
        perimeter = 2 * (length + height);

        // Display area
        System.out.println("The area of the rectangle is: " + area);
        // Display perimeter
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner
        sc.close();
    }
}
