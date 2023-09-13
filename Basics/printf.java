import java.util.*;
public class printf {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!.. Please enter your name ");
        String str = scan.nextLine();

        System.out.printf("Hello %s\n", str);
        System.out.println("Enter your age.");
        int age = scan.nextInt();

        System.out.printf("Hello %s!!! It is great to know that you are %d years old.\n", str, age);
        System.out.println("Enter any number to check for the format specifiers:");
        int num = scan.nextInt();
        System.out.printf("The Decimal Number is : %d \n The Octal Number is : %o \n The Hexa Decimal Number is %x \n", num, num, num);

        System.out.println("Enter any Decimal number to check for the format specifiers:");
        float num1 = scan.nextFloat();
        System.out.printf("The Decimal Number is : %f \n The Octal Number is : %e \n The Hexa Decimal Number is %g \n", num1, num1, num1);

        System.out.printf("This is to understand the argument index:" + "%3$s %2$f %1$d", num, num1,str);
        scan.close();

    }
    
}
