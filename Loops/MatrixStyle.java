package Loops;

import java.util.Scanner;

public class MatrixStyle {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns :");
        int columns = scan.nextInt();
        
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= columns ; j++) {
             System.out.print((i+j)+ " ");
            }
            System.out.println("\n ");
        }
        scan.close();
    }
    
}
