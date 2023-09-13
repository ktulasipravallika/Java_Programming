package Arrays;

import java.util.Scanner;

public class InsertingElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements required in array :");
        int n = scan.nextInt();

        int A[] = new int[n+10];

        System.out.println("Enter the elements in array :");
        for(int i = 0 ; i < n ; i ++){
            A[i] = scan.nextInt();
        }

        System.out.println("The index at which the element needs to be inserted :");
        int index = scan.nextInt();

        System.out.println("The element that needs to be inserted :");
        int number = scan.nextInt();

        for(int i = n+1; i > index ; i--){
            A[i] = A[i-1];
        }

        A[index] = number;

        System.out.println(" The elements after insertion are : ");
        for(int i =0; i < n+1 ; i++){
            System.out.println(A[i]);
        
        scan.close();

    }
}
    
}
