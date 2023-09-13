import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        
        System.out.println("Enter two numbers a and b :");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The Sum is :" + (a + b));
        System.out.println("The Difference is :" + (a - b));
        System.out.println("The Multiplication is :" + (a * b));
        System.out.println("The Division is :" + (a / b));
        System.out.println("The Mod is :" + (a % b));
        scan.close();



    }
    
}
