package Classes_Objects.RectangleClass;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Rectangle re = new Rectangle();
        Rectangle re1 = new Rectangle();
        
        System.out.println("Enter the length of the rectangle 1 : ");
        re.length = scan.nextDouble();//property

        System.out.println("Enter the breadth of the rectangle 1 : ");
        re.breadth = scan.nextDouble();//property


        System.out.println("The Area of the rectangle is : " + re.calculateArea());// functions
        System.out.println("The Perimeter of the rectangle is : " + re.calculatePerimeter());// functions
        System.out.println("Does the given measurements results in square ?  : " + re.isSquare());// functions
        
        System.out.println("Enter the length of the rectangle 2 : ");
        re1.length = scan.nextDouble();//property

        System.out.println("Enter the breadth of the rectangle 2 : ");
        re1.breadth = scan.nextDouble();//property


        System.out.println("The Area of the rectangle is : " + re1.calculateArea());// functions
        System.out.println("The Perimeter of the rectangle is : " + re1.calculatePerimeter());// functions
        System.out.println("Does the given measurements results in square ?  : " + re1.isSquare());// functions
        scan.close();
    }

    
}
