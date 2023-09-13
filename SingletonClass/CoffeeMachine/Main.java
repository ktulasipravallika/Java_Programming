package SingletonClass.CoffeeMachine;

public class Main {
    public static void main(String[] args) {
        
        //CoffeMachine cm = new CoffeMachine();- not allowed as the constructor is private

        CoffeMachine cm1 = CoffeMachine.getInstance();
        cm1.fillCoffeeqty(2);
        cm1.fillMilkqty(2);
        cm1.fillSugarqty(2);
        cm1.fillWaterqty(2);
        cm1.getCoffee();       
        
        CoffeMachine cm2 = CoffeMachine.getInstance();
        
        cm2.getCoffee();    
      
        System.out.println(cm1 + "\n" + cm2);
        System.out.println((cm1==cm2) ? "Same" : "Not Same");

    }
    
}
