import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        String resultString = replaceVowelsWithZ(inputString);

      
        System.out.println(resultString);

      
        scanner.close();
    }

 
    public static String replaceVowelsWithZ(String str) {
        String vowels = "AEIOUaeiou";
        boolean hasVowel = false;
        String result = "";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                result += 'z';
                hasVowel = true;
            } else {
                result += ch;
            }
        }

        if (!hasVowel) {
            return "No vowels in the string";
        }

        return result;
    }
}
