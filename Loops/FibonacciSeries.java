package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter howmany tersm of fibonacci series should be displayed :");
        int terms = scan.nextInt();
        int n1 = 0, n2 =1;
        System.out.println("the fibonacci series is :\n" +n1);
        int series = 1;
        for (int i = 0; i <= terms-2 ; i++){
            
            System.out.println(series);
            series = n1 + n2;
            n1 =n2;
            n2 = series;
        }   
        scan.close();
    }
    
}
