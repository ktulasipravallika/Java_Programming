package Loops;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number for the geometric Progression Series :");
        int startNumber = scan.nextInt();

        System.out.println("Enter the starting number for the geometric Progression Series :");
        int ratio = scan.nextInt();

        System.out.println("Enter the starting number for the geometric Progression Series :");
        int terms = scan.nextInt();

        System.err.println("The geometric progression series is :");
        for(int i =1; i<=terms; i++){

            System.err.print(startNumber +"\t");
            startNumber = startNumber * ratio;
        }
       
        scan.close();
    }
    
}
