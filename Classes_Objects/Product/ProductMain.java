package Classes_Objects.Product;

public class ProductMain {
    public static void main(String[] args) {
        
       Product pr = new Product("1234" , "pravallika" , 2000, 500);
       Product pr1 = new Product("1234" , "Tulasi" , 8000);
       Product pr2 = new Product("1234" , 20000, 500);

       System.out.println("The details of the product 1 are : " + pr.getItemNo() + "\n" + pr.getName() + "\n" + pr.getPrice() + "\n" + pr.getQuantity());
       System.out.println("The details of the product 2 are : " + pr1.getItemNo() + "\n" + pr1.getName() + "\n" + pr1.getPrice() + "\n" + pr1.getQuantity());
       System.out.println("The details of the product 3 are : " + pr2.getItemNo() + "\n" + pr2.getName() + "\n" + pr2.getPrice() + "\n" + pr2.getQuantity());
       
    }
    
}
