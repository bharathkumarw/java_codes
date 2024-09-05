import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Array to store the count of students for each mark
        int[] marksCount = new int[101]; // Index 0 to 100 for marks from 0 to 100

        // Prompt the user to enter the marks of each student
        System.out.println("Enter the marks of " + numStudents + " students:");
        for (int i = 0; i < numStudents; i++) {
            int marks = scanner.nextInt();
            // Increment the count for the respective mark
            marksCount[marks]++;
        }

        // Print the count of students for each mark
        for (int i = 0; i <= 100; i++) {
            if (marksCount[i] > 0) {
                System.out.println("Number of students got " + i + " marks: " + marksCount[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
