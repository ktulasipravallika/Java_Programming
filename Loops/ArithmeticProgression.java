package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number of the arithmetic progression series :");
        int startNumber = scan.nextInt();

        System.out.println("Enter the difference between numbers in the arithmetic progression series :");
        int difference = scan.nextInt();

        System.out.println("Enter the number of terms to be displayed in the arithmetic progression series :");
        int terms = scan.nextInt();

        System.out.println("The Arithmetic Progression Series is :");
        
        for(int i = 1; i <= terms ; i++ ){
            System.out.print(startNumber + "\t");
            startNumber = startNumber + difference;
           
        }

        scan.close();
    }
    
}
