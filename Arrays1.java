import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];

      
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        int sum = calculateSum(array);

    
        System.out.println("The sum of the array elements is: " + sum);

        
        scanner.close();
    }

  
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
