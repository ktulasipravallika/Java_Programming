package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int n = scan.nextInt();

        int A[] = new int[n];
        System.out.println("Enter the elements in array :");
        for(int i = 0; i <  n ; i ++) {
            A[i] = scan.nextInt();
        }
        int max = 0;
        int secLargest = 0;

        for( int i = 0; i < n; i++){

            if(A[i]>max){
                secLargest = max;
                max = A[i];  
            }
            else if(A[i] > secLargest){
                secLargest = A[i];

            }
        }
        System.out.println("The second largest number : " + secLargest );
        scan.close();

    }
    
}
