package Loops;

import java.util.Scanner;

public class MatrixStyle2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns :");
        int columns = scan.nextInt();
        int z = 1;
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= columns ; j++) {
            
                System.out.printf("%02d ", z++);

             }
            System.out.println("\n ");
        }
        scan.close();
    }
    
}
