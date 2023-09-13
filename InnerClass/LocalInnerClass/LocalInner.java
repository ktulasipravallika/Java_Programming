package InnerClass.LocalInnerClass;

public class LocalInner {

    int x = 10;

    void display() {
        int y = 20;
        class Inner {
            void innerDisplay() {
                System.out.println("Hi this is inner class method ...");
            }

        }

        Inner i = new Inner();
        i.innerDisplay();

        new Inner().innerDisplay();// similar to above lines. This can be used when the object is only used once.

        System.out.println("The value of x is : " + x );
        System.out.println("The value of y is : " + y );
    }
    
}
