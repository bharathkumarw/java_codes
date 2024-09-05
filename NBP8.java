import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        
        int decimalNumber = convertToDecimal(binaryNumber);

      
        System.out.println("The decimal equivalent of " + binaryNumber + " is: " + decimalNumber);

        
        scanner.close();
    }

    
    public static int convertToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int length = binaryNumber.length();

        
        for (int i = 0; i < length; i++) {
            
            char binaryDigit = binaryNumber.charAt(length - 1 - i);

            
            if (binaryDigit == '1') {
                decimalNumber += Math.pow(2, i);
            }
        }

        return decimalNumber;
    }
}
