package Conditional_Statements;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers to compare :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a>b && a>c){
            System.out.println(a + "is larger number");
        }
        else if (b>c && b>a){
            System.out.println(b + " is larger number");
        }
        else{
            System.out.println(c + "is larger number");
        }
        scan.close();
    }
    
}
