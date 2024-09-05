import java.util.Scanner;

public class DecimalToBinaryManual {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        
        String binaryNumber = convertToBinary(decimalNumber);

        
        System.out.println("The binary equivalent of " + decimalNumber + " is: " + binaryNumber);

      
        scanner.close();
    }

    
    public static String convertToBinary(int decimalNumber) {
       
        if (decimalNumber == 0) {
            return "0";
        }

       
        StringBuilder binary = new StringBuilder();

       
        while (decimalNumber > 0) {
            
            int remainder = decimalNumber % 2;
            
            binary.insert(0, remainder);
            
            decimalNumber = decimalNumber / 2;
        }

        return binary.toString();
    }
}
