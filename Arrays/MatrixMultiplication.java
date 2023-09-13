package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrices :");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns in the matrices :");
        int columns = scan.nextInt();

        int A[][] = new int[rows][columns];
        int B[][] = new int[rows][columns];
        int C[][] = new int[rows][columns];

        System.out.println("Enter the elements of the array A :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the elements of the array B :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                B[i][j] = scan.nextInt();
            }
        }
        System.out.println("The elements of the array A are :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
               System.out.print(A[i][j] + "  ");
            }
            System.out.println( "  ");
        }
        System.out.println("The elements of the array B are :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
               System.out.print(B[i][j] + " ");
            }
            System.out.println( "  ");
        }
        System.out.println("The addition of the arrays/ matrices A and B is : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                C[i][j] = 0;
                for(int k = 0 ; k < 3 ; k++){
                C[i][j] = C[i][j]+(A[i][k] * B[k][j]);
                }
            }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){

               System.out.print(C[i][j] + "  ");
            }
            System.out.println( "  ");
        }
       
        scan.close();
    }  
}


