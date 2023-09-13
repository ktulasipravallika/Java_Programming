package Classes_Objects.RectangleClass;

public class Rectangle {
    public double length;
    public double breadth;

    public double calculateArea(){
            return (length * breadth);
        }

    public double calculatePerimeter(){
            return 2 * (length + breadth);

        }
    public boolean isSquare(){
       return (length == breadth) ? true : false;

    }
}
