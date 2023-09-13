package InnerClass.NestedInnerClass;

public class Main {

    public static void main(String[] args) {
        
        NestedInnerClass i = new NestedInnerClass();

        i.outerDisplay();
        System.out.println("The value of x is : " + i.x);

        NestedInnerClass.Inner ii = new NestedInnerClass().new Inner();
        ii.innerDisplay();
        System.out.println("The value of y is : " + ii.y);
    }
    
}
