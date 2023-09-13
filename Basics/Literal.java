public class Literal {
    public static void main(String[] args) {
        
        byte b = 15;
        short s= 12;
        int i = 13;
        System.out.println(b+s+i);
        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;
        System.out.println("b1:" +b1 + "b2:" + b2 + "b3:" + b3 + "b4" + b4);

        long l = 125;
        System.out.println("long l value is : "+l);

        long l1 = 6565434536456L;
        System.out.println("Long values should contain L at the end and the given l values is : "+l1);

        /* Here compatible types should be assigned as a long values is assigned to integer which lleads to loss of infomation , so this is not allowed.
        int i1 = 123L;
        System.out.println("integer i1 :" + i1); */


        //Underscore (_) can be used in between to improve the readability.
        long l2 = 999_000_22;
        float f2 = 123_45678.567f;

        System.out.println("Long Value is :;" + l2);
        System.out.println("Float Value is :" + f2);

     }
    
}
