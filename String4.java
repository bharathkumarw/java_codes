import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
    
        int[] charCounts = countCharacters(inputString);
        
     
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println("'" + (char)i + "': " + charCounts[i]);
            }
        }
        
    
        scanner.close();
    }
    
    public static int[] countCharacters(String inputString) {
     
        int[] charCounts = new int[256]; // Assuming ASCII characters
        
  
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            charCounts[ch]++;
        }
        
        return charCounts;
    }
}
