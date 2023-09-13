package MethodOverriding.MethodOverridingExample;

public class Main {

    public static void main(String[] args) {
        
        ParentClass pc = new ParentClass();
        SubClass sc = new SubClass();
        ParentClass pcsc = new SubClass(); 
        
        pc.display();
        System.out.println(" \n ");
        sc.display();
        System.out.println(" \n ");
        pcsc.display();
    }
    
}
