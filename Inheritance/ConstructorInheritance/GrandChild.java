package Inheritance.ConstructorInheritance;

public class GrandChild extends Child1{

    public GrandChild(){
        System.out.println("Hi I am Grand Child");
    }
    
    public GrandChild(int x, int y){
        System.out.println("Hi i am 2 Parameterized Constructor of Grand Child" + x + y);
    }
}
