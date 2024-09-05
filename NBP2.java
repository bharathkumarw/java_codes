import java.util.Scanner;

public class NBP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] marks = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            
            
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                i--; 
            }
        }
        
        scanner.close();
        

        int passCount = 0;
        for (int mark : marks) {
            if (mark > 35) {
                passCount++;
            }
        }
        
      
        System.out.println("Number of students who passed the exam: " + passCount);
    }
}
