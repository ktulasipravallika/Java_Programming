import java.util.*;

// A program to output the area of a triangle.

public class AreaTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter choice:\n 1. If you know length of three sides of the triangle press 1\n 2. If you know the length of base and heightof the triangle press 2 ");

        int choice = scan.nextInt();

        if (choice == 2) {

            System.out.println("Enter the length of base of the triangle");
            float base = scan.nextFloat();

            System.out.println("Enter the length of height of the triangle");
            float height = scan.nextFloat();
        
            float area = (base * height)/ 2;

            System.out.println("The area of the triangle is:" + area);
        }

        else if(choice == 1) {

            System.out.println("Enter the length of side1 of the triangle");
            float side1 = scan.nextFloat();

            System.out.println("Enter the length of side 2 of the triangle");
            float side2 = scan.nextFloat();

            System.out.println("Enter the length of side 3 of the triangle");
            float side3 = scan.nextFloat();
        
            float s = (side1 + side2 +side3)/2;

            float x = s*(s-side1)*(s-side2)*(s-side3);

            System.out.println("The area of the triangle is:" + Math.sqrt(x));
        }

        else {
            System.out.println("Enter the valid choice..");
        }
        scan.close();

    }
    
}
