package Loops;

import java.util.Scanner;

public class TwoVariableLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers to print");
        for(int i = 0,j = 1000;i <=100;j--,i++){
            System.out.println("the result is " + i + "\t" + j*i);
        }
        scan.close();

    }
    
}