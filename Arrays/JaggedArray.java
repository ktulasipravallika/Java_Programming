package Arrays;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the row count in the array :");
        int rows = scan.nextInt();

        int rowCount[] = new int[rows];

        int array[][] = new int[rows][];

        for(int i = 0; i < rows ; i++){
            System.out.println("Enter the count of elements in the row " + i + " of the array :");
            rowCount[i] = scan.nextInt();
            array[i] = new int[rowCount[i]];
        }

        System.out.println("The columns length of each row is :");

        for(int i = 0; i < rows ; i++){

            System.out.println("row - " + (i+1) + " has "+rowCount[i] + "elements");
           
        }
        System.out.println("Enter the elements in the array A :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < rowCount[i] ; j++ ){
                array[i][j] = scan.nextInt();
            }
        }
        for(int i = 0 ; i < rows ; i ++){
            for(int j = 0; j < rowCount[i] ; j++ ){
                System.out.print(array[i][j] + "   ");
            }
            System.out.println("   ");
        }
        scan.close();
    }
    
}
