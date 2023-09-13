package MethodOverriding.DynamicMethodDispatch;

public class Child extends Parent {

    @Override
    void Method1 (){
        System.out.println("Child Method 1");
    }
    
    @Override
    void Method2 (){
        System.out.println("Child Method 2");
    }

    void Method4 (){
        System.out.println("Child Method 4");
    }
    
}
