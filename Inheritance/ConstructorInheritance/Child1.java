package Inheritance.ConstructorInheritance;

public class Child1 extends Parent{

    public Child1(){
        System.out.println("Hi I am Child 1");
    }

    public Child1(int x){
        System.out.println("Hi i am Parameterized Constructor of Child1" + x);
    }
    
}
