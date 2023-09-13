package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any number to reverse the number :");
        int number = scan.nextInt();
        int mod= 0;
        int reverse = 0;

        while(number>0){
            mod = number % 10;
            reverse = reverse*10 + mod;
            number = number/10;
        }
        System.out.println("The reverse number would be :" + reverse);
        scan.close();
    }
    
}
