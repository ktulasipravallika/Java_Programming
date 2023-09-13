package Methods;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number to understand recursion :");
        int number = scan.nextInt();

        Recursion re = new Recursion();
        re.recursion(number);
        re.recursionRev(number);

        scan.close();
    }

    void recursion(int x) {

        if (x > 0) {
            System.out.println("The number is : " + x);
            recursion(x - 1);
        }
        System.out.println("\n");
    }
    void recursionRev(int x) {

        if (x > 0) {
            recursionRev(x - 1);
            System.out.println("The number is : " + x);
        }

    }
}
