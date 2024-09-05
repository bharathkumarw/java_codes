import java.util.Scanner;

public class Arrays5{
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

       
        int[] percentageCount = new int[10]; 

  
        System.out.println("Enter the marks of " + numStudents + " students:");
        for (int i = 0; i < numStudents; i++) {
            int marks = scanner.nextInt();
            int percentageRange = marks / 10; 
            percentageCount[percentageRange]++;
        }

    
        for (int i = 0; i < percentageCount.length; i++) {
            int rangeStart = i * 10;
            int rangeEnd = rangeStart + 10;
            System.out.println("Number of students with percentage " + rangeStart + "-" + (rangeEnd - 1) + "%: " + percentageCount[i]);
        }

     
        scanner.close();
    }
}
