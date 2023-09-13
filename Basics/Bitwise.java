public class Bitwise {
    public static void main(String[] args) {

        int x= 00001010, y = 00001011;
        int z= -10;

        System.out.println("The binary value of x is " + Integer.toBinaryString(x));
        System.out.println("The binary value of y is " + Integer.toBinaryString(y));
        System.out.println("The binary value of z is " + Integer.toBinaryString(z));
        System.out.println("The values of AND is :" + (x&y) + "\tThe Binary form is " + Integer.toBinaryString((x&y)));
        System.out.println("The values of OR is  " + (x|y) + "\tThe Binary form is " + Integer.toBinaryString((x|y)));
        System.out.println("The values of XOR is " + (x^y) + "\tThe Binary form is " + Integer.toBinaryString((x^y)) );
        System.out.println("The values of NOT is " + ~x + "\tThe Binary form is " + Integer.toBinaryString(~x));
        System.out.println("The values of RIGHT SHIFT OF X is " + (x>>1)+ "\tThe Binary form is " + Integer.toBinaryString(x>>1));
        System.out.println("The values of LEFT SHIFT OF X is " + (x<<1) + "\tThe Binary form is " + Integer.toBinaryString(x<<1));
        System.out.println("The values of UNSIGNED RIGHT SHIFT OF X is " + (x>>>1) + "\tThe Binary form is " + Integer.toBinaryString(x>>>1));
        System.out.println("The values of UNSIGNED RIGHT SHIFT OF Z is " + (z>>>1) + "\tThe Binary form is " + Integer.toBinaryString(z>>>1));
    }
}
