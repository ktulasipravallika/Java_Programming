package Static.StaticBlock;

public class Main {

    static {
        System.out.println("I am here from main method ...");
    }

    public static void main(String[] args) {


        StaticBlock sb = new StaticBlock();
        sb.display();
        System.out.println("This is main method....");
        
    }

    static{
        System.out.println("This is done from main method......");
    }
    
}
