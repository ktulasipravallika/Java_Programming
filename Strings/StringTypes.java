
import java.util.Scanner;
public class StringTypes {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = "Hello World";

        String str2 =new String("This is introduction to Strings");

        char c[] = {'c','h','a','r'};
        String str3 = new String(c);

        byte b[] = {65,66,67,68};
        String str4= new String(b);

        System.out.println("This is String Data type:" + str1);
        System.out.println("This is String Class:" + str2);
        System.out.println("This is Character Array :" + str3);
        System.out.println("This is Byte Array Data :" + str4);

        //String Objects


        char ch[] = {'a','p','p','l','e','i','s','a'};
        String str5 = new String(ch,2,3);
        System.out.println("This is to print the required letters from the character array : " +str5);
        

        byte e[] = {65,66,67,68,69,70,71,72,73,74};
        String str6= new String(e,3,6);

        System.out.println("This is to print the required letters from the byte array array : " + str6);
        scan.close();

        
        String str7= "Java";
        String str8 = "Java"; //if we give JAVA - the output will be false. as it stores them in two different objects.
        String str9  = new String("Java");
        System.out.println("This is to check if str7 and str8 are equal or not :"+ (str7==str8));
        System.out.println("This is to check if str7 and str9 are equal or not :"+ (str7==str9));
        
    }
    
}
