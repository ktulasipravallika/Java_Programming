package Methods;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GCD gcd = new GCD();

        System.out.println("Enter two numbers to find their GCD : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("The GCD of the given two numbers is : " + gcd.gcdOfNumbers(num1, num2));

        scan.close();
    }

    int gcdOfNumbers(int x, int y) {
        while (x!=y){
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        } 
        return x;
    }
}
