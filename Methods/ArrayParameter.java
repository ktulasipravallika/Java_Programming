package Methods;

import java.util.Scanner;

public class ArrayParameter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayParameter ap = new ArrayParameter();

        System.out.println("Enter the number of elements in array : ");
        int n = scan.nextInt();

        int A[] = new int[n];
        
        System.out.println("Enter the elements in the array :");
        for(int i = 0 ; i < n ; i++){
            A[i] = scan.nextInt();
        }
        ap.updateArray(A);

        System.out.println("The elements in the array after the method call are :");

        for(int i = 0 ; i < n ; i++){
            System.out.println(A[i]);
        }

        scan.close();
    }
    
    void updateArray(int A[]) {

       for(int i = 0; i < A.length ; i++){
         A[i]= ++A[i];
       }
    }
}
