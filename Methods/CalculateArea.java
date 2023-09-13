package Methods;

import java.util.Scanner;

public class CalculateArea {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        CalculateArea ca = new CalculateArea();

        System.out.println("Enter the length of the rectangle : ");
        float length = scan.nextFloat();

        System.out.println("Enter the breadth of the rectangle : ");
        float breadth = scan.nextFloat();

        System.out.println("Enter the radius of the circle : ");
        double radius =scan.nextFloat();

        System.out.println("Enter the height of the trapezium : ");
        double height =scan.nextFloat();

        System.out.println("Enter the length of side 1 of the trapezium : ");
        double side1 =scan.nextFloat();
        System.out.println("Enter the length of side 2 of the trapezium : ");
        double side2 =scan.nextFloat();

        System.out.println(ca.area(length,breadth));
        System.out.println(ca.area(radius));
        System.out.println(ca.area(side1, side2, height));

        scan.close();
    }

    float area(float x, float y){

        return (x*y);

    }
    double area(double r){

       return (Math.PI * r * r);

    }

    double area( double side1 , double side2, double height){

        return (0.5 * (side1 + side2) * height);

    }
    
}
