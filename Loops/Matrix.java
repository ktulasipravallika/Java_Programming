package Loops;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows required in the matrix :");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns required in the matrix :");
        int columns = scan.nextInt();

        for(int i = 1; i <=rows ; i++){

            for(int j = 1; j <= columns; j++ ){

                System.out.print(i + "  ");
            }
            System.out.println("");
        }
        scan.close();
    }
    
}
