package Loops;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any number :");
            float number = scan.nextFloat();

            float result = number;

            System.out.println("Enter power of the number : ");
            int power = scan.nextInt();

            int i = 1 ;

            while (i < power){
                result = number * result;
                System.out.println("The result at "+i+"th iteration is :" + result);
                i++;
            }
            System.out.println("The result is : " + result);
            scan.close();
    }
    
}
