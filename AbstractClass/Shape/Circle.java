package AbstractClass.Shape;

public class Circle extends Shape {

    double radius;

    void area(){
        System.out.println(" The area of the Rectangle is : " +  Math.PI * radius * radius);
    }
    void perimeter(){
        System.out.println("The perimeter of the rectangle is : " +  2 * Math.PI * radius);
    }

    void display(){
        System.out.println("Hi I am a Circle");
    }
    
}
