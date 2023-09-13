package Conditional_Statements;

import java.util.Scanner;


public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects");

        float c = scan.nextFloat();
        float ca = scan.nextFloat();
        float db = scan.nextFloat();

        float total = (c + ca + db);
        float percentage = (total*100)/300;

        if(percentage>=75){
            System.out.println("Grade : A" );
        }
        else if (percentage>=60 && percentage<75){
            System.out.println("Grade : B" );
        }
        else if (percentage>=50 && percentage<60){
            System.out.println("Grade : C" );
        }
        else if (percentage>=40 && percentage<50){
            System.out.println("Grade : D" );
        }
        else{
                System.out.println("Grade : F" );
            }
            scan.close();
        }
}
