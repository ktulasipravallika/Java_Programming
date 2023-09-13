package AbstractClass.Shape;

public class Main {

    public static void main(String[] args) {
        
        Shape sc = new Circle();
        Shape sr = new Rectangle();

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        sc.area();
        sc.display();
        sc.perimeter();

        sr.area();
        sr.display();
        sr.perimeter();

        c.area();
        c.display();
        c.perimeter();

        r.area();
        r.display();
        r.perimeter();
        
    }
    
}
