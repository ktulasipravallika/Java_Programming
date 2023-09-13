package Arrays;

import java.util.Scanner;


public class RotationArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = scan.nextInt();

        int A[] = new int[n];

        System.out.println("Enter the array elemets ");
        for(int i = 0 ; i < n ; i++){
            A[i]= scan.nextInt();
        }
        
        System.err.println("The elements in the array after rotation are : ");
        int temp =  A[0];

        for(int i = 1 ; i < n ; i ++){
            
            A[i-1] = A[i];
            
        }
        A[n-1] = temp;
        for(int i = 0 ; i < n ; i ++){
            System.out.println(i + " - "+ A[i]);
        }
        
        scan.close();
    }
    
}
