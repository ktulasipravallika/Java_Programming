package Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
      
        int A[] = new int[n] ;
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i< n; i++) {

            A[i]= scan.nextInt();
            sum = sum + A[i];

        }
        System.err.println("The sum of elements in the given array is :" +sum);
        scan.close();
    }
    
}
