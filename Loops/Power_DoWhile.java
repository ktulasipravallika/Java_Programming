package Loops;

import java.util.Scanner;

public class Power_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number :");
        float number = scan.nextFloat();

        System.out.println("Enter power of the number : ");
        int power = scan.nextInt();

        float result = number;
        int i = 1 ;

        do{
            result = number * result;
            System.out.println("The result at "+i+"th iteration is :" + result);
            i++;

        }while(i < power);

        System.out.println("****The final result is : " + result + "****");
        scan.close();
    }
}