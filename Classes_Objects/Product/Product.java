package Classes_Objects.Product;

public class Product {

    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public String getItemNo(){
        return itemNo;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        if(p < 0) price = 0;
        else price = p;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int q){
       if(quantity < 0) quantity = 0;
       else quantity = q;
    }

    public Product(String iNo, String n, double p, int q){
        itemNo = iNo;
        name = n;
        price = p;
        quantity = q;
    }

    public Product(String iNo, double p, int q){
        itemNo = iNo;
        name = "";
        price = p;
        quantity = q;
    }
    public Product(String iNo, String n, int q){
        itemNo = iNo;
        name = n;
        price = 0;
        quantity = q;
    }
    public Product(String iNo, String n, double p){
        itemNo = iNo;
        name = n;
        price = p;
        quantity = 0;
    }
    
}
