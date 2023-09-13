package Inheritance.Cylinder;

public class Circle {

    public double radius;

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    public double calculatePerimeter(){
        return calculateCircumference();    
    }
    
}
