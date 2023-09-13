package Classes_Objects.Circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Circle cr = new Circle();// object creation
        Circle cr1 = new Circle();// object creation

        System.out.println("Enter the radius of the circle 1 : ");
       
        cr.radius = scan.nextDouble();//property
        
        System.out.println("Enter the radius of the circle 2 : ");
       
        cr1.radius = scan.nextDouble();//property 

        //cr Object
        System.out.println("The Area of the circle is : " + cr.calculateArea());// functions
        System.out.println("The Circumference of the circle is : " + cr.calculateCircumference());// functions
        System.out.println("The Circumference of the circle is : " + cr.calculatePerimeter());// functions

        //cr1 object 
        System.out.println("The Area of the circle is : " + cr1.calculateArea());// functions
        System.out.println("The Circumference of the circle is : " + cr1.calculateCircumference());// functions
        System.out.println("The Circumference of the circle is : " + cr1.calculatePerimeter());// functions

        scan.close();
    }
}