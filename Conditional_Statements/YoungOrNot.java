package Conditional_Statements;

import java.util.Scanner;

public class YoungOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age :");
        int age = scan.nextInt();

        if(age>+14 && age<=55){
            System.out.println("The person is young");
        }
        else{
            System.out.println("The person is not young");
        }
        scan.close();

    }
    
}
