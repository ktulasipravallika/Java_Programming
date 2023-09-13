package InnerClass.StaticInnerClass;

public class StaticInnerClass {

    int x = 10;
    static int y = 20;
    static class StaticInner {
        public void display()   {
           // System.out.println("The value of x is : " + x); - cannot access, as x is not static variable
            System.out.println("The value of y is : " + y);
            System.out.println("The value of x is : " + new StaticInnerClass().x);
        }
    }


    
}
