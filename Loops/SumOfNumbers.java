package Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many numbers should be added :");
        int numbers = scan.nextInt();

        int result = 0;

        for (int i=0; i<=numbers ; i++){

             result  = result + i;
        }
        System.out.println("The result is : " + result);
        scan.close();
    }
    
}
