package AbstractClass;

public class Main {
    public static void main(String[] args) {
        
        // Parent p = new Parent(); - not allowed as parent class is abstract class.

       // SubClass1 sc1 = new SubClass1(); - not allowed as Subclass1 class is abstract class.

        SubClass sc = new SubClass();
        sc.Method1();
        sc.Method2();
        
        Parent psc = new SubClass(); 
        
        psc.Method1();
        psc.Method2();
    }
}
