package Arrays;

import java.util.Scanner;


public class RightRotation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = scan.nextInt();

        int A[] = new int[n];
        //int B[] = new int[n];

        System.out.println("Enter the array elemets ");
        for(int i = 0 ; i < n ; i++){
            A[i]= scan.nextInt();
        }
        
        System.out.println("The elements in the array after rotation are : ");
        int temp =  A[n-1];

        for(int i = (n-1); i >=1 ; i--){
          
            // B[i] = A[i-1];
            A[i] = A[i-1];
             
        }

       // B[0] = temp;
       A[0] = temp;

        for(int i = 0 ; i < n ; i ++){

           // System.out.println(i + " - "+ B[i]);
             System.out.println(i + " - "+ A[i]);

        }
        
        scan.close();
    }
    
}
