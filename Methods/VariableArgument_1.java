package Methods;

import java.util.Scanner;

public class VariableArgument_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        VariableArgument_1 va1 = new VariableArgument_1();

        System.out.println("Enter the number of students :");
        int n = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the names ");
        String names[] = new String[n];

        for(int i = 0 ; i < n; i++){
            names[i]= scan.nextLine();
        }
        
        System.out.println("Enter the start roll number for the students : ");
        va1.displayNames(25, names);
        va1.displayNames(89, "ram", "ravi", "reeta", "sita", "geeta");
        scan.close();
    }
    
    void displayNames(int x ,String ... s){
        System.out.println("The names are : ");
        for(int i = 0 ; i < s.length ; i++){
            System.out.println(x + " " +s[i]);
            x++;
        }
    }
}
