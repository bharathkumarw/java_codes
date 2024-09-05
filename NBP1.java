public class NBP1 {
    public static void main(String[] args) {
        // Initialize three variables A, B, and C
        int A = 1;
        int B = 2;
        int C = 3;
        
        // Print original values
        System.out.println("Original values:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        
        // Swap the values
        int temp = A; // Store original value of A in temp
        A = C;       // Assign value of C to A
        C = B;       // Assign value of B to C
        B = temp;    // Assign original value of A (stored in temp) to B
        
        // Print new values after swapping
        System.out.println("Values after swapping:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
    }
}
