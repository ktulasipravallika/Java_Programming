import java.util.Scanner;

public class Merge_Mask {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two number to merge and store in same variable");

        byte a = scan.nextByte();
        byte b = scan.nextByte();

        byte c = (byte) (b<<4) ;

        c = (byte) (c|a);

        System.out.println("The Binary number for the first value entered is :" + a + ":" + Integer.toBinaryString(a));
        System.out.println("The Binary number for the first value entered is :" + b + ":" + Integer.toBinaryString(b));
        System.out.println("The Binary number for the first value entered is :" + c + ":" + Integer.toBinaryString(c));
        System.out.println("The second number is: " + ((c&0b11110000)>>4));
        System.out.println("The first number is: " + ((c&0b00001111)));
        scan.close();

    }
    
}
