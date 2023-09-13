package Conditional_Statements;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to check even or odd : ");
        int number = scan.nextInt();
        if(number%2 == 0 && number != 2 && number != 0){
            System.out.println("The entered number is even number");
        }
        else if(number % 2 !=0 && number != 0){
            System.out.println("The entered number is odd number");
        }
        else{
                System.out.println("The entered number is 2 or 0");
            }
            scan.close();
        }
     
    }
    
