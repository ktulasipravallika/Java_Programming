import java.util.Scanner;

public class FlagsWidth {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scan.nextInt();

        System.out.printf("The number is : %010d\n" ,num );
        System.out.printf("The number is : %(10d\n" ,num );
        System.out.printf("The number is : %+10d\n" ,num );
        System.out.printf("The number is : %-10d\n" ,num );
       

        System.out.println("Enter any float number:");
        float num1 = scan.nextFloat();
        scan.nextLine();

        System.out.printf("The number is : %10.3f \n" ,num1 );
        System.out.printf("The number is : %010f \n" ,num1);
        System.out.printf("The number is : %.1f \n" ,num1);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.printf("The number is : %10s \n" ,name );
        System.out.printf("The number is : %-10s \n" ,name );


        scan.close();
    }
    
}
