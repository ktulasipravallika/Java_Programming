package Loops;

import java.util.Scanner;

public class Armstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find if the number is Armstrong number or not :");
        int number = scan.nextInt();
        int value = number;
        int armstrong = 0;

        while (value !=0){
            int mod = value %10;
            value =value/10;
            armstrong = (mod*mod*mod) + armstrong;
            System.out.println(armstrong);
        }

        if(armstrong == number){
            System.out.println("The given number is an armstrong number");
        }
        else
            System.out.println("The given number is not an armstrong number");
        scan.close();
    }
    
}
