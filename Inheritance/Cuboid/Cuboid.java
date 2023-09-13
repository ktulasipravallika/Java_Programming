package Inheritance.Cuboid;

public class Cuboid extends Rectangle {

    public double height;
    
    public Cuboid(){
        height = 1;
    } 

    public Cuboid(double h){
        height = h;
    }
    
    public Cuboid(double l, double b, double h){
        super(l, b);
        height = h;
    }

    public double calculateVolume(){
        return length * breadth * height;
    }
    
}
