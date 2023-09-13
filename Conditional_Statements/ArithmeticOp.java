package Conditional_Statements;

import java.util.Scanner;

public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to perform arithmetic operation :");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        scan.nextLine();

        System.out.println("Enter the operation to perform ");
        String operation = scan.nextLine();
        
        switch(operation){
            case "ADD" :
                System.out.println("Addition of two numbers is :" + (a+b));
                break;
            case "SUB" :
                System.out.println("Subtraction of two numbers is :" + (a-b));
                break;
            case "MUL" :
                System.out.println("Multiplication of two numbers is :" + (a*b));
                break;
            case "DIV" :
                System.out.println("Division of two numbers is :" + (a/b));
                break;
            case "MOD" :
                System.out.println("Modulus of two numbers is :" + (a%b));
                break;
        }
        scan.close();    
    }
    
}
