package Conditional_Statements;

import java.util.Scanner;

public class NegPos {
    public static void main(String[] args) {
       System.out.println("Enter any number :");
       Scanner scan = new Scanner(System.in);
        
       int number = scan.nextInt();
       if(number> 0) {
            System.out.println("The given number is positive.");
       }
       else if(number <0){
            System.out.println("The given number is negative.");
       }
       else{
        System.out.println("The given number is zero.");
       }

       scan.close();
    }
}
