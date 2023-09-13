package Conditional_Statements;

import java.util.Scanner;

public class LeapYrOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth date ");
        int year = scan.nextInt();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year %400 ==0){
                    System.out.println("The enetered year is a leap year "); 
                }
                else{
                    System.out.println("The enetered year is not a leap year ");
                }
            }
            else{
                System.out.println("The enetered year is a leap year ");
            }
        }
        else{
        System.out.println("The entered year is not a a leap year");
        }
        scan.close();
    }
}
