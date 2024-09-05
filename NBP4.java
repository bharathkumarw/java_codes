import java.util.Scanner;

public class NBP4 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is zero, even, or odd
        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
