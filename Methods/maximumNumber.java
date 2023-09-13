package Methods;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to find the maximum number : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("The maximum number is : " + maximum(x,y));//actual parameters
        scan.close();
    }

    public static int maximum(int x, int y){//formal parameters, the changes made here will not effect the actual parameters
        if(x>y){
            return x;
        }
        else if(x<y){
            return y;
        }
        else 
            return 0;
    }
}
