import java.util.Scanner;

public class RegularExp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet : ");
         String str1 = scan.nextLine();
         System.out.println("Checking if the given string matches [.]- Any Character :" + str1.matches("."));
         System.out.println("Checking if the given string matches [abc] :" + str1.matches("[abc]"));
         System.out.println("Checking if the given string doesnot matches [^abc]- :" + str1.matches("[^abc]"));
         System.out.println("Checking if the given string matches any Character from a-z or 0-9 :" + str1.matches("[a-z 0-9]"));
         System.out.println("Checking if the given string matches 1st character with [a-z] and 2nd character with [0-9]:" + str1.matches("[a-z][0-9]"));
         System.out.println("Checking if the given string matches a or b" + str1.matches("a|b"));
         System.out.println("Checking if the given string matches abc exactly : " + str1.matches("abc"));


         System.out.println("Checking if the given string matches digits : " + str1.matches("\\d"));
         System.out.println("Checking if the given string matches not Digits : " + str1.matches("\\D"));
         System.out.println("Checking if the given string matches alphabets or digits : " + str1.matches("\\w"));
         System.out.println("Checking if the given string neither matches alphabets or digits  : " + str1.matches("\\W"));
         System.out.println("Checking if the given string matches space  : " + str1.matches("\\s"));
         System.out.println("Checking if the given string matches not spaces  : " + str1.matches("\\S"));


         System.out.println("Checking the regexp (*) : " + str1.matches("[abc]*") );
         System.out.println("Checking the regexp (+) : " + str1.matches("[a-z]+"));
         System.out.println("Checking the regexp ({X}) : " + str1.matches("[a-z]{3}"));
         System.out.println("Checking the regexp ({XY}) : " + str1.matches("[a-z]{1,6}") );
         System.out.println("Checking the regexp (?) : " + str1.matches("[a-z][0-9]?"));

         System.out.println("Enter your email id :");
         String str2 = scan.nextLine();

         System.out.println("This is to check if the enetered string is email id or not :" + str2.matches("[a-z 0-9]*@gmail(.*)"));

         scan.close();
    }

}
