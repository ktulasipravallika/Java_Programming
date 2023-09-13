package Methods;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MethodOverloading mo = new MethodOverloading();

        int x = 10;
        int y = 19;
        int z = 21;
        float a= 10.3234f;
        float b = 345.54352f;

        System.out.println(mo.maxNumber(x,y));
        System.out.println(mo.maxNumber(x,y,z));
        System.out.println(mo.maxNumber(a,b));

        scan.close();
    }

    int maxNumber(int x, int y) {

        System.out.println("method 1 is called :");

        return x > y ? x : y;

    }

    float maxNumber(float x, float y) {

        System.out.println("method 2 is called :");

        return x > y ? x : y;

    }

    int maxNumber(int x, int y, int z) {

        System.out.println("method 3 is called :");

        if ((x > y) && (x > z)) {
            return x;
        } else if ((y > x) && (y > z)) {
            return y;
        } else if ((z > x) && (z > y)) {
            return z;
        }
        return 0;

    }

}
