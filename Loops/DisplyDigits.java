package Loops;

import java.util.Scanner;

public class DisplyDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to display the individual digits :");
        int number = scan.nextInt();

       
        int mod=0;
        int i =0;

        while (number != 0)  {
            mod = number%10;
            number = number/10;
            System.out.println(mod);
            i++;
        }

        System.out.println("The number of digits in the given number is : " + i);
        scan.close();
    }
    
}
