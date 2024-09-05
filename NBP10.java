import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int digitCount = countDigits(number);

       
        System.out.println("The number " + number + " has " + digitCount + " digits.");

    
        scanner.close();
    }

  
    public static int countDigits(int number) {
       
        if (number == 0) {
            return 1;
        }

        
        int count = 0;

        
        number = Math.abs(number);

      
        while (number > 0) {
            number /= 10; 
            count++;
        }

        return count;
    }
}
