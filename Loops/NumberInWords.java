package Loops;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to display in words :");
        int number = scan.nextInt();

        int mod,i;
        String reverse = "";

        while(number>0){
            mod = number %10;
            reverse = reverse + mod;
            number = number/10;
        }
        System.out.println("The given number is : " + reverse);

        for(i = reverse.length()-1;i>=0;i--){

            switch(reverse.charAt(i)){
                case '0': System.out.println("Zero");
                            break;
                case '1': System.out.println("One");
                            break;
                case '2': System.out.println("Two");
                            break;
                case '3': System.out.println("Three");
                            break;
                case '4': System.out.println("Four");
                            break;
                case '5': System.out.println("Five");
                            break;
                case '6': System.out.println("Six");
                            break;
                case '7': System.out.println("Seven");
                            break;
                case '8': System.out.println("Eight");
                            break;
                case '9': System.out.println("Nine");
                            break;
                default : System.out.println("invalid Number");
                            break;
            }
            scan.close(); 
        }
    
    }
   
}
