import java.util.Scanner;

public class NBP5 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNumber = scanner.nextInt();

        // Calculate the sum of the three integers
        int sum = firstNumber + secondNumber + thirdNumber;

        // Print the result
        System.out.println("The sum of the three integers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
