package Methods;

import java.util.Scanner;

public class maximumNumberobj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to find the maximum number : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        maximumNumberobj mno = new maximumNumberobj();
        System.out.println("The maximum number is : " + mno.maximum(x, y));
        scan.close();
    }

     int maximum(int x, int y) {
        if (x > y) {
            return x;
        } else if (x < y) {
            return y;
        } else
            return 0;
    }
}
