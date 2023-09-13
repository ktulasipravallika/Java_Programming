package Classes_Objects.GetterSetter;

public class Rectangle {
    private double length;
    private double breadth;

    public double calculateArea() {
        return (length * breadth);
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);

    }

    public boolean isSquare() {
        return ((length == breadth) && length!=0 && breadth !=0) ? true : false;

    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;

    }

    public void setLength(double l) {
        if (l >= 0) {
            length = l;
        } else {
            length = 0;
        }

    }

    public void setBreadth(double b) {
        if (b >= 0) {
            breadth = b;
        } else {
            breadth = 0;
        }
    }
}
