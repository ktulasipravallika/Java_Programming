
import java.util.Scanner;

public class RegExpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :" );
        String number = scan.nextLine();

        if(number.matches("[0|1]*")){

            System.out.println("Entered number is binary number");
        }
        else if (number.matches("[0-9]*[A-F]*")){

            System.out.println("Entered number is hexa-decimal number ");
        }
        else {
            System.out.println("Entered number is neither binary not hexa-decimal number");
        }

        System.out.println("Enter your data of Birth in (dd/mm/yyyy) format:");

        String dob = scan.nextLine();

        if(dob.matches("[0-3][0-9]/[0-1]{1}[0-9]{1}/[0-9]{4}"))
        {
            System.out.println("Great!..");
        }
        else
        {
            System.out.println("Please enter the date in the specified format");
        }

        scan.close();

    }
    
}
