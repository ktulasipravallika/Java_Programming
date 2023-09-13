package Inheritance.ConstructorInheritance;

public class Main {

    public static void main(String[] args) {
        
        Parent pr =new Parent();
        System.out.println(" \n");
        Parent pr1 = new Parent(10);
        System.out.println(" \n");

        Child1 c1 = new Child1();
        System.out.println(" \n");
        Child1 c11 = new Child1(20);
        System.out.println(" \n");

        Child2 c2 = new Child2();
        System.out.println(" \n");
        Child2 c22 = new Child2(30);
        System.out.println(" \n");

        GrandChild gc = new GrandChild();
        System.out.println(" \n");
        GrandChild gc1 = new GrandChild(40, 50);
        System.out.println(" \n");

        System.out.println(pr);
        System.out.println(pr1);
        System.out.println(c1);
        System.out.println(c11);
        System.out.println(c2);
        System.out.println(c22);
        System.out.println(gc);
        System.out.println(gc1);

    }

    
}
