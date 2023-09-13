package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers to print in increasing order : ");
        int numInc = scan.nextInt();

        for(int i = 0; i <= numInc ;i++){
            System.err.println(i);
        }
        System.out.println("Enter how many number to print in Decreasing order : ");
        int numDec = scan.nextInt();

        System.out.println("The strat number :");
        int startNum = scan.nextInt();

        for(int i = startNum; i >= numDec ;i--){
            System.err.println(i);
        }
        scan.close();
    }
    
}
