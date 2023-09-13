package Interfaces.StoreExample;

public class Customer implements IMember {

    String name;

    Customer(String n) {
        name = n;
    }

    public void callBack() {
        System.out.println(" I will visit the store.. Thank you !..." + name);

    }
    
}
