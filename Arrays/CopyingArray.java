package Arrays;

import java.util.Scanner;

public class CopyingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements required in array :");
        int n = scan.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];

        System.out.println("Enter the elements in array A :");
        for(int i = 0 ; i < n ; i ++){
            A[i] = scan.nextInt();
        }

        System.out.println("The elements in array B are :");
        for( int i = 0; i < n ; i ++){
            B[i] = A[i];
            System.out.println(B[i]);
        }

        scan.close();
    }
    
}
