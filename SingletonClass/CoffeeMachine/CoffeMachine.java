package SingletonClass.CoffeeMachine;

public class CoffeMachine {

    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    static private CoffeMachine myMachine = null;
    static int count;

    private CoffeMachine(){
        coffeeQty = 1;
        milkQty = 1;
        sugarQty= 1;
        waterQty = 1;
    }

    public void fillWaterqty(float qty){
        waterQty = qty;
    }
    public void fillCoffeeqty(float qty){
        coffeeQty = qty;
    }
    public void fillMilkqty(float qty){
        milkQty = qty;
    }
    public void fillSugarqty(float qty){
        sugarQty = qty;
    }

    public void getCoffee(){
        System.out.println("You coffee quantity is : " + coffeeQty + milkQty + waterQty + sugarQty );
    }

    static public CoffeMachine getInstance(){

        if(myMachine == null && count <= 3)
           myMachine = new CoffeMachine();
           System.out.println("The count is :" + count);
           count++;

        if(count > 3){
            System.out.println("The object cannot be created - exceeds the limit");
        }
        return myMachine;
    } 
}
