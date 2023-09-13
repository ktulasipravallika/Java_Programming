import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email id: ");
        String email = scan.nextLine();

        if(email.matches("[a-z A-Z 0-9]*@gmail.com")){

            System.out.println("The entered email id is gmail");
        }
        else {
            System.out.println("The entered email id is not gmail");
        }

        int index = email.indexOf('@');

        System.out.println("The username is : " + email.substring(0, index));
        System.out.println("The Domain name is : " + email.substring(index+1));
        scan.close();
    }
    
}
