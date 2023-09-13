import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c of your quadratic expression:");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        float x = (b*b) - (4*a*c);
        double sqrt = Math.sqrt(x);

        double root1 = (-b + sqrt)/(2*a);
        double root2 = (-b - sqrt)/(2*a);

        System.out.println("The roots of the given quadratic expression with the values of \n a :" + a + "\t b :" + b + "\t c :" +c + "\t are :");
        System.out.println("root 1 = " + root1);
        System.out.println("root2 = " + root2);

        scan.close();

    }
    
}
