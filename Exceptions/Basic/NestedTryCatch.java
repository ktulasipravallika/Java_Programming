package Exceptions.Basic;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the number of elements in the array : ");
        int n = scan.nextInt();

        System.out.println("Enter the elements in the array :");
        int A[] = new int[n];

        for( int i = 0 ; i < n ; i++ ){
            A[i] = scan.nextInt();
            
        }

        try{
            for(int i = 0 ;i < n-1 ; i ++){
                int division = A[i]/ A[i+1];
                System.out.println("The division of " + i + "and " + (i+1) + "is :" + division);
            }
            
            try{
                System.out.println("Enter the element position for review :");
                System.out.println("The elelemt is :" + A[scan.nextInt()]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The position entered is bigger than the array size ");
            }

        }
        catch(ArithmeticException e){
            System.out.println("The division by 0 is not allowed.");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        scan.close();
    }
    
}
