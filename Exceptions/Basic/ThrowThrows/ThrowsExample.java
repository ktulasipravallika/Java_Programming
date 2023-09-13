package Exceptions.Basic.ThrowThrows;

import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any 2 integers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        try {
            meth1(a, b);
        }
        catch(ArithmeticException e){

            System.out.println(e);
        }
        finally{
            System.out.println("Bye!.. End of the program...");
        }
        scan.close();

    }

    public static void meth1(int a , int b) throws ArithmeticException {

        int r = meth2(a , b);

        System.out.println("The result is : " + r);

    }

    public static int meth2(int a, int b) throws ArithmeticException {

        if(b < 0){
            throw new ArithmeticException();
        }
        
            int c = a/b;

        return c;
    }
    
}
