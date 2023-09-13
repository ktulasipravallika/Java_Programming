package Inheritance.Bank;

public class LoanAccount extends Account {

    public LoanAccount(String aNo , String name , String addr , String phNo , String doB , double balance){
        super(aNo,  name ,  addr ,  phNo ,  doB , balance);
    }
    
    public void payEMI(double amt){
        
        balance -= amt; 
    }

    public void rePay(){
        balance = 0;
    }
}
