package Loops;

import java.util.Scanner;

public class MatrixStyle4 {
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of size of square matrix : ");

            int rows = scan.nextInt();

            int z = 1; 

            for(int i = 1 ; i <= rows ; i++){
    
                for(int j = 1 ; j <= i ; j++) {
    
                        System.out.printf("%02d ",z++);
    
                 }

                System.out.println("\n ");
            }
            scan.close();
        }
        
}

