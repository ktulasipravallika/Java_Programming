package Arrays;

import java.util.Scanner;

public class IncreasingSize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements required in array :");
        int n = scan.nextInt();

        int A[] = new int[n];
        int B[] = new int[2 *A.length];

        System.out.println("Enter the elements in array A :");
        for(int i = 0 ; i < n ; i ++){
            A[i] = scan.nextInt();
        }

        System.out.println("The elements in array B are :");
        for( int i = 0; i < n ; i ++){
            B[i] = A[i];
            System.out.println(B[i]);
        }
        System.out.println("The size of array A is : " + A.length);
        System.out.println("The size of array B is : " + B.length);

        A = B;

        B = null;

        System.out.println("The size of array A is : " + A.length);
 
        scan.close();

    }
    
}
