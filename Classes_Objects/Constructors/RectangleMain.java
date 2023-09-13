package Classes_Objects.Constructors;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rectangle rt = new Rectangle();
        Rectangle rt1 = new Rectangle(10,20);
        Rectangle rt2 = new Rectangle(30,80);
        Rectangle rt3 = new Rectangle(-30,-80);
        Rectangle rt4 = new Rectangle(23);

        System.out.println("The area of rectangle 1 is :" + rt.calculateArea());
        System.out.println("The perimeter of rectangle 1 is :" + rt.calculatePerimeter());
        System.out.println("Does the given measurements results in sqaure ? " + rt.isSquare());

        System.out.println("The area of rectangle 2 is :" + rt1.calculateArea());
        System.out.println("The perimeter of rectangle 2 is :" + rt1.calculatePerimeter());
        System.out.println("Does the given measurements results in sqaure ? " + rt1.isSquare());

        System.out.println("The area of rectangle 3 is :" + rt2.calculateArea());
        System.out.println("The perimeter of rectangle 3 is :" + rt2.calculatePerimeter());
        System.out.println("Does the given measurements results in sqaure ? " + rt2.isSquare());

        System.out.println("The area of rectangle 4 is :" + rt3.calculateArea());
        System.out.println("The perimeter of rectangle 4 is :" + rt3.calculatePerimeter());
        System.out.println("Does the given measurements results in sqaure ? " + rt3.isSquare());

        System.out.println("The area of rectangle 5 is :" + rt4.calculateArea());
        System.out.println("The perimeter of rectangle 5 is :" + rt4.calculatePerimeter());
        System.out.println("Does the given measurements results in sqaure ? " + rt4.isSquare());

        scan.close();
    }
}
