package Inheritance.Cylinder;

public class Cylinder extends Circle {

    public double height ;

    public double calculateVolume(){
        return calculateArea() * height;
    }
}
