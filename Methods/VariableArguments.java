package Methods;

public class VariableArguments {
    public static void main(String[] args) {

        VariableArguments va = new VariableArguments();

        va.display();
        va.display(10);        
        va.display(10, 20);        
        va.display(10, 20, 30);        
        va.display(10, 20, 30, 40);        
        va.display(10, 20, 30, 40, 50);        
        va.display(new int[] {10, 20, 30, 40, 50, 60});   
    }

    void display(int ... A){
        System.out.println("The elements entered are : ");
        for(int x : A){
            System.out.println(x);
        }
    }
    
}
