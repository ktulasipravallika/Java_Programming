package Inheritance.Bank;

public class Main {
    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount("Acc1","Pravallika","California","9909989969","9-96-2", 100000);
        LoanAccount sa2 = new LoanAccount("Acc2","Tulasi","Vijayawada","9988776655","32-96-2", 1000221);

        sa2.payEMI(3000);
        sa.deposit(20000);

        System.out.println("The balance in savings Account :" + sa.balance);
        System.out.println("The balance in Loan Account :" + sa2.balance );
        sa.display();

       
    }
    
}
