package Inheritance.ConstructorInheritance;

public class Child2 extends Parent {

    public Child2(){
        System.out.println("Hi I am Child 2");
    }

    public Child2(int x){
        super(x);
        System.out.println("Hi i am Parameterized Constructor of Child1" + x);
    }
    
}
