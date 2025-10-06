package EnglishExercisesP2;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // students as int
        int students;
        // team size as int
        int teamSize;
        // number of teams as int
        int numberOfTeams;
        // students left as int
        int studentsLeft;

        // Display program title
        System.out.println("=== Team Divider ===");

        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        // Save number of students
        students = sc.nextInt();

        // Prompt for team size
        System.out.print("Enter the team size: ");
        // Save team size
        teamSize = sc.nextInt();

        // Calculate number of teams
        numberOfTeams = students / teamSize;

        // Calculate number of students left without a team
        studentsLeft = students % teamSize;

        // Display number of teams
        System.out.println("Number of teams that can be formed: " + numberOfTeams);

        // Display number of students left without a team
        System.out.println("Number of students without a team: " + studentsLeft);

        // Close the scanner
        sc.close();
    }
}
