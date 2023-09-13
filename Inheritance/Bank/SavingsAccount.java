package Inheritance.Bank;

public class SavingsAccount  extends Account {

    public SavingsAccount(String aNo , String name , String addr , String phNo , String doB , double balance){
        super(aNo,  name ,  addr ,  phNo ,  doB , balance);
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw (double amt){

        balance -= amt;
    }

    void display(){

        System.out.println(super.getName());
    }
    
}
