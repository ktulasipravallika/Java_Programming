package Conditional_Statements;

import java.util.Scanner;

public class ProtocolWebsiteSwitch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your website url");
        String url = scan.nextLine();

        int protocolIndex = url.indexOf(":");
        String protocol = url.substring(0, protocolIndex);

        int index = url.lastIndexOf(".");   
        String website = url.substring(index+1);

        switch(protocol){
            case "http" :
                System.out.println("The given url is Hyper Text Transfer Protocol");
                break;
            case "https" :
                System.out.println("The given url is Hyper Text Transfer Protocol Secure");
                break;
            case "ftp" :
                System.out.println("The given url is File Transfer Protocol");
                break;
            default :
                System.out.println("invalid Website");
        }

        switch(website) {
            case "com" :
                 System.out.println("The given url is of Commercial Type" );
                 break;
            case "org" :
                 System.out.println("The given url is of Organization Type" );
                 break;
            case "net" :
                 System.out.println("The given url is of Network Type" );
                 break;
            case "gov" :
                 System.out.println("The given url is of Government Type" );
                 break;
            default :
                 System.out.println("invalid Website");
        }
        scan.close();
    }
    
}
