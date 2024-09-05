import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

     
        int smallestDivisor = findSmallestDivisor(number);

        
        if (smallestDivisor == number) {
            System.out.println("The number " + number + " is prime and its smallest divisor other than 1 is: " + number);
        } else {
            System.out.println("The smallest divisor of " + number + " other than 1 is: " + smallestDivisor);
        }

        
        scanner.close();
    }

 
    public static int findSmallestDivisor(int number) {
  
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return i; // Return the first divisor found
            }
        }
        return number;
    }
}
