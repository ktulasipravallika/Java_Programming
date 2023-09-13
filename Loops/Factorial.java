package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial :");
        int number = scan.nextInt();
        int factorial = 1;

        for (int i = 2; i<=number; i++){
            factorial= factorial * i;
        }

        System.out.println("The factorial of the given number is :" + number +"!" + "=" +factorial);
        scan.close();

    }
    
}
