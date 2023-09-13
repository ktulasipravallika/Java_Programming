package Methods;

import java.util.Scanner;

public class ValidateNameAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       

        ValidateNameAge vna = new ValidateNameAge();

        System.out.println("Enter the name of the child : ");
        String name = scan.nextLine();

        System.out.println("Enter the age of the child : ");
        int age = scan.nextInt();

        if(vna.validate(name)== true && vna.validate(age) == true){
            System.out.println("The child is eligible to join");
        }
        else{
            System.out.println("The child is not eligible to join");
        }
        scan.close();
    }
    
    Boolean validate(String name){

        return name.matches("[a-z A-Z\\s]+");

    }

    Boolean validate(int age){
        return ((age<=10) &&(age >=5));

    }
}
