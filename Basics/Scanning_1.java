import java.util.*;
public class Scanning_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name ;
        System.out.println("Your name please");
        name = scan.nextLine();
        System.out.print("Welcome"+name);
        scan.close();
    }
}
