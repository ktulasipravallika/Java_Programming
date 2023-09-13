package Classes_Objects.Circle;

public class Circle {

    double radius;

    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    public double calculateCircumference() {
        return calculatePerimeter();
    }
}
