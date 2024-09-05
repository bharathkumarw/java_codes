import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int size = 20;
        int[] array = new int[size];

       
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        reverseArray(array);

       
        System.out.println("The array elements after rearranging in reverse order:");
        for (int num : array) {
            System.out.print(num + " ");
        }

       
        scanner.close();
    }

    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
         
            start++;
            end--;
        }
    }
}
