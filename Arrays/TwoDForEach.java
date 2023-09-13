package Arrays;

import java.util.Scanner;

public class TwoDForEach {
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

        for( int x[] : A){
            for(int y : x) {
                System.out.print(y +  " ");
            }
            System.out.println(" ");
        }
        
        scan.close();
    }
    
}
