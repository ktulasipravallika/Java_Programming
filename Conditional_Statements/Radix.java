package Conditional_Statements;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :");
        String number = scan.nextLine();
        if(number.matches("[01]+")){
            System.out.println("The given number is Binary Number and Binary Radix = 2");
        }
        else if(number.matches("[0-7]+")){
            System.out.println("The given number is Octal Number and Octal radix = 8 ");
        }
        else if(number.matches("[0-9]+")){
            System.out.println("The given number is Decimal Number and Decimal Radix =10 ");
        }
        else if(number.matches("[0-9 A-F]+")){
            System.out.println("The given number is Hexa Decimal Number and Hexa Decimal Radix = 16 ");
        }
        else {
            System.out.println("Enter the valid number");
        }
        scan.close();
    }
    
}
