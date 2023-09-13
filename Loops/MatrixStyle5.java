package Loops;

import java.util.Scanner;

public class MatrixStyle5 {
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of size of square matrix : ");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns :");
        int columns = scan.nextInt();
 
        for(int i = 1 ; i <= rows ; i++){

            for(int j = 1 ; j <= columns ; j++) {

                if(j<=columns-i+1){
                    System.out.print("$" + " ");
                }
                else{
                    System.out.print(" ");                
                }
            }
            System.out.println("\n ");
        }
        scan.close();
    }
}
