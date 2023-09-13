package Inheritance.Bank;

public class Account {

    private String accountNo;
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    protected double balance;

    public String getAccountNo(){
        return accountNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setAddress(String addr){
        if(!addr.equals(null)) address = addr;
        else address = " ";
    }

    public void setPhoneNo(String phno){
        if(!phno.equals(null)) phoneNumber = phno;
        else phoneNumber = " ";
    }

    public void setDOB(String dOB){
        if(!dOB.equals(null)) dOB = dateOfBirth;
        else dateOfBirth = " ";
    }

    public double getBalance(){
        return balance;
    }

    public Account(String aNo, String name , String addr , String phNo , String doB, double balance ){
        accountNo= aNo;
        this.name = name;
        address = addr;
        phoneNumber = phNo;
        dateOfBirth = doB;
        this.balance = balance ;

    } 
    public Account(){

        accountNo= " ";
        this.name = " ";
        address = " ";
        phoneNumber =  " ";
        dateOfBirth = " ";
        balance = 0;

    } 
}
