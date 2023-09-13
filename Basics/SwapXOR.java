import java.util.*; 

public class SwapXOR {
   
    public static void main(String[] args) {
        
        System.out.println("Enter two numbers to swap :");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("The values of a and b before swapping is : " + " a = " + a + " b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 

        System.out.println("The values of a and b after swapping is : " + " a = " + a + " b = " + b);
        scan.close();
    }
    
}
