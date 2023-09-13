// Scanner class is present in the below package
import java.util.*;


public class Scanning {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); /* creating object for Scanner Class and object is scan "System.in" is to read the data from System*/
        int a , b, c;
        System.out.println("Enter two numbers"); 
        a = scan.nextInt();
        b = scan.nextInt();
        c = a + b;
        System.out.println("Sum of two integers is :" +c);
        scan.close();
    
    }
} 