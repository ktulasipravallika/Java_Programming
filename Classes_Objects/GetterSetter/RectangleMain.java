package Classes_Objects.GetterSetter;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Rectangle re = new Rectangle();
       
        
        System.out.println("Enter the length of the rectangle 1 : ");
        re.setLength(scan.nextDouble());//property

        System.out.println("Enter the breadth of the rectangle 1 : ");
        re.setBreadth(scan.nextDouble());//property

        System.out.println("The length is :" + re.getLength());
        System.out.println("The breadth is :" + re.getBreadth());
        System.out.println("The Area of the rectangle is : " + re.calculateArea());// functions
        System.out.println("The Perimeter of the rectangle is : " + re.calculatePerimeter());// functions
        System.out.println("Does the given measurements results in square ?  : " + re.isSquare());// functions
        
        scan.close();
    }

    
}
