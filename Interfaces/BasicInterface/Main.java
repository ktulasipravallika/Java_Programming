package Interfaces.BasicInterface;

public class Main {
    public static void main(String[] args) {
        
        InterfaceBasic ib = new ImplementingClass();
        ImplementingClass ic = new ImplementingClass();  

        ib.meth1();
        ib.meth2();

        ic.meth1();
        ic.meth2();
        ic.meth3();
    }
    
}
