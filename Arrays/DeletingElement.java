package Arrays;

import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements required in array :");
        int n = scan.nextInt();

        int A[] = new int[n];

        System.out.println("Enter the elements in array :");
        for(int i = 0 ; i < n ; i ++){
            A[i] = scan.nextInt();
        }

        System.out.println("The index at which the element needs to be deleted :");
        int index = scan.nextInt();

        for(int i = index; i < n-1 ; i++){
            if(i == index) {
                A[index] = A[i+1];
            }
            else{
            A[i] = A[i+1];
            }
        }
        A[n-1] =0;

        System.out.println(" The elements after deletion are : ");
        for(int i =0; i < n; i++){

            System.out.println(A[i]);
        }
        scan.close();
    }
    
}
