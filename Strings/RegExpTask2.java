import java.util.Scanner;

public class RegExpTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = scan.nextLine();
        
        System.out.println("The String after removing the special charachter looks like :" + str.replaceAll("[^A-Z a-z 0-9]", ""));

        String str1 = str.replaceAll("\\s+", " ").trim();
        System.out.println("The String after removing the white Spaces looks like :" + str1);

        String str2[] = str1.split("\\s");

        System.out.println("The number of words in the string is:" + str2.length);
        scan.close();

    }  
}
