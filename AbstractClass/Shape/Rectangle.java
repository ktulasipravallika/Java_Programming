package AbstractClass.Shape;

public class Rectangle extends Shape{

    double length;
    double breadth;

    void area(){
        System.out.println("The area of the Rectangle is : " + length * breadth);
    }
    void perimeter(){
        System.out.println("The perimeter of the rectangle is : " + 2 * (length + breadth));
    }
    
    void display(){
        System.out.println("Hi I am a Rectangle");
    }
}
