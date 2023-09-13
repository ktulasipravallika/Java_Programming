package MethodOverriding.DynamicMethodDispatch;

public class Main {

    public static void main(String[] args) {
        
        Parent p = new Parent();
        Child c = new Child();

        Parent pc = new Child(); // Dynamic Method Dispatch

        p.Method1();
        p.Method2();
        p.Method3();
        System.out.println(" \n ");

        c.Method1();
        c.Method2();
        c.Method4();
        c.Method3();
        System.out.println(" \n ");

        pc.Method1();
        pc.Method2();
        pc.Method3();
       //  pc.Method4(); not allowed as the reference is of parent class and the parent  class did not have this method.
    }
    
}
