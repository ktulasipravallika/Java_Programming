import java.util.*;

public class UseRadix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter anydecimal number");
        scan.useRadix(2);
        int binary =scan.nextInt();
        System.out.println("The binary number for the decimal number given is :" +binary);
        scan.close();

    }
    
}
