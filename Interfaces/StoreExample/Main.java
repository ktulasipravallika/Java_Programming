package Interfaces.StoreExample;


public class Main {
    public static void main(String[] args) {
        
        Store s = new Store();
        IMember m = new Customer("Pravallika");

        s.register(m);
        s.inviteCustomerSale();
    }
    
}
