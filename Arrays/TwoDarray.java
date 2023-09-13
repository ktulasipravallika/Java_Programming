package Arrays;

import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows required in the 2-D array");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns required in the 2-D array");
        int columns = scan.nextInt();

        int A[][] = new int[rows][columns];

        System.out.println("Enter the array elements :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < columns ; j++){
                A[i][j] = scan.nextInt();
            }
        }

        System.out.println("The elements in the array are :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < columns ; j++){
                System.out.printf("%4d \t",A[i][j]);
            }
            System.out.println("\n");
        }
        scan.close();
        
    }

    
}
