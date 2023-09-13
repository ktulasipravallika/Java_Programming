package InnerClass.NestedInnerClass;

public class NestedInnerClass {
    int x = 10;
    
    class Inner {
        int y = 20;
        void innerDisplay() {
            System.out.println("The value of the x is :" + x);
            System.out.println("The value of the y is :" + y);
        }
    }

    void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(" The value of the y is :" + i.y);
    }
}
