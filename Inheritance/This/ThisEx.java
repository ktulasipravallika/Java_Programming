package Inheritance.This;

public class ThisEx {

    double length;
    double breadth;

    ThisEx(){
        length = breadth = 1;
    }

    ThisEx(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea(){
        
        System.out.println("The length of the rectangle is " + this.length );
        System.out.println("The breadth of the rectangle is " + this.breadth);
        System.out.println("The area of the rectangle is " + length * breadth);
    }
}
