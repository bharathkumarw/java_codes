import java.util.Scanner;

public class Arrays2{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        int size = 20;
        int[] array = new int[size];

        
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        int[] maxNumbers = findMaxNumbers(array, 3);
        int[] minNumbers = findMinNumbers(array, 3);

    
        System.out.println("The 3 maximum numbers are:");
        for (int num : maxNumbers) {
            System.out.println(num);
        }

        System.out.println("The 3 minimum numbers are:");
        for (int num : minNumbers) {
            System.out.println(num);
        }

      
        scanner.close();
    }

  
    public static int[] findMaxNumbers(int[] array, int count) {
        int[] maxNumbers = new int[count];
        
        for(int i = 0; i < count; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            maxNumbers[i] = array[i];
        }
        return maxNumbers;
    }

    
    public static int[] findMinNumbers(int[] array, int count) {
        int[] minNumbers = new int[count];
        
        for(int i = 0; i < count; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            minNumbers[i] = array[i];
        }
        return minNumbers;
    }
}
