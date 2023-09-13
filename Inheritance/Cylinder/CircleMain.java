package Inheritance.Cylinder;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {

        Cylinder cr = new Cylinder();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder base : ");
        cr.radius = scan.nextDouble();

        System.out.println("Enter the height of the cylinder : ");
        cr.height = scan.nextDouble();

        System.out.println("The area of the Cylinder surface : " + cr.calculateArea());
        System.out.println("The volume of the Cylinder : " + cr.calculateVolume());
        System.out.println("The circuference of the Cylinder  : " + cr.calculateCircumference());
        System.out.println("The perimeter of the Cylinder : " + cr.calculatePerimeter());

        scan.close();
    }
    
}
