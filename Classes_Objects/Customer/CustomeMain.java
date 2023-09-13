package Classes_Objects.Customer;

public class CustomeMain {
    public static void main(String[] args) {
        
       Customer cr = new Customer("1234" , "cravallika" , "california", "999-123-4566");
       Customer cr1 = new Customer("5678", "Texas" , "012-345-6778");
       Customer cr2 = new Customer("8910" , "Tulasi", "456-456-4567");

       System.out.println("The details of the Customer 1 are : " + cr.getCustId() + "\n" + cr.getName() + "\n" + cr.getAddress() + "\n" + cr.getPhno());
       System.out.println("The details of the Customer 2 are : " + cr1.getCustId() + "\n" + cr1.getName() + "\n" + cr1.getAddress() + "\n" + cr1.getPhno());
       System.out.println("The details of the Customer 3 are : " + cr2.getCustId() + "\n" + cr2.getName() + "\n" + cr2.getAddress() + "\n" + cr2.getPhno());
       
    }
    
}

    
