package Exceptions.Basic;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        try {
            int c = a / b;
            System.out.println("The division of two numbers is : " + c);
        } 
        
        catch (ArithmeticException e) {
            System.out.println("The division by zero is not allowed");
            System.out.println(e);
        }
        System.out.println("End of the Program");
        scan.close();
    }
}
