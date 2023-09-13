package Arrays;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int n = scan.nextInt();

        System.out.println("Enter the elements in the array : ");
        int A[] = new int[n];
        int maxNumber =0 ;
        for(int i = 0 ; i < n ; i++) { 

            A[i] = scan.nextInt();
            if(A[i]>maxNumber) {

                maxNumber = A[i];

            }
        }
        System.out.println("The maximum number is :" +maxNumber);

        scan.close();
    }
    
}
