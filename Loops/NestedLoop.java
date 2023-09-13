package Loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row count : ");
        int rows = scan.nextInt();

        System.out.println("Enter number of columns");
        int columns = scan.nextInt();

        for (int i = 0 ; i < rows ; i ++ ){

            for(int j = 0 ; j < columns ; j++){

                System.out.print("(" + i +""+ j + ")" + "  ");
            }
            System.out.println("");

        }
        scan.close();
    }
    
}
