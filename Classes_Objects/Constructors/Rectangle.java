package Classes_Objects.Constructors;

public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(double l, double b) {
        length = l;
        breadth = b;

    }

    Rectangle(double s) {
        length = breadth = s;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (length < 0) {
            length = 0;
        } else
            length = l;
    }

    public void setBreadth(double b) {
        if (breadth < 0) {
            breadth = 0;
        } else
            breadth = b;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth ? true : false;
    }

}
