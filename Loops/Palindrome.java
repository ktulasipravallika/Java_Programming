package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to check if the number is palindrome or not :");
        int number = scan.nextInt();
        int value = number;
        int mod, reverse = 0;
        while(number>0){
            mod = number %10;
            reverse = reverse * 10 + mod;
            number = number/10;
        }
        if (value == reverse){
            System.out.println("The given number is palindrome");
        }
        else
            System.out.println("The given number is not a palindrome");
        scan.close();
    }
    
}
