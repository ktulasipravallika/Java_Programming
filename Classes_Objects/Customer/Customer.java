package Classes_Objects.Customer;

public class Customer {

    private String custId;
    private String name;
    private String address;
    private String phNo;

    public String getCustId(){
        return custId ;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String addr){
        address = addr;
    }

    public String getPhno(){
        return phNo;
    }
    public void setPhno(String ph){
        phNo = ph;
    }

    public Customer(String cid, String n, String addr, String phno){
        custId = cid;
        name = n;
        address = addr;
        phNo = phno;
    }

    public Customer(String cid, String addr, String phno){
        custId = cid;
        name = "";
        address = addr;
        phNo = phno;
    }
   
}
    
