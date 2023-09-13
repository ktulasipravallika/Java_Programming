package Methods;

import java.util.Scanner;

public class ChangeInMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Enter any number : ");
        x = scan.nextInt();

        ChangeInMethod cm = new ChangeInMethod();       
        
        System.out.println("The value of x after increment is : " + cm.increment(x));
        System.out.println("The valu of x after calling methodis :" + x);
        scan.close();
    }


    int increment(int x){
       
        return ++x;
    }

}
