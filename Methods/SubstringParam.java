package Methods;

import java.util.Scanner;

public class SubstringParam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SubstringParam sp = new SubstringParam();

        System.out.println("Enter your email id :");
        String email = scan.nextLine();

        System.out.println("The user name is : " + sp.username(email));
        
        scan.close();
    }

    String username(String email){
        int index = email.indexOf("@");

        String userName = email.substring(0, index);

        return userName;
    }
    
}
