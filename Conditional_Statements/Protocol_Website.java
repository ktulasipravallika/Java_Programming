package Conditional_Statements;

import java.util.Scanner;

public class Protocol_Website {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any website");
        String url = scan.nextLine();

        int protocolIndex = url.indexOf(":");
        String protocol = url.substring(0, protocolIndex);

        int index = url.lastIndexOf(".");   
        String website = url.substring(index+1);

        if(protocol.equals("http")){
            System.out.println("The given url is Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("The given url is File Transfer Protocol");
        }
        else {
            System.out.println("invalid website");
        }

        if(website.equals("com")){

            System.out.println("The given url is of Commercial Type" );
        }
       else if(website.equals("org")){
            
            System.out.println("The given url is of Organization Type" );
        }
        else if(website.equals("net")){
            
            System.out.println("The given url is of Network Type" );
        }
        else {
            System.out.println("invalid website");
        }

        scan.close();
    }
    
}
