package Loops;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter which table to be displayed :");
        int table = scan.nextInt();

        System.out.println("Enter how many steps to be displayed :");
        int steps = scan.nextInt();

        System.out.println("Table " + table);

        for(int i = 1; i<=steps ; i++){
            System.out.println(table + "*" + i + "=" + table*i);
        }
        scan.close();
    }

    
}
