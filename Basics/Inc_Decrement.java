import java.util.*;

public class Inc_Decrement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the choice: \n 1. Post Increment \n 2.Pre Increment \n 3. Post Decrement \n 4. Pre Decrement");
        int choice = scan.nextInt();
        
        System.out.println("Enter the value of x");
        int x = scan.nextInt();
        int y;
        switch(choice){
            case 1 : 
                y = x++;
                System.out.println("Post Increment : \n" +"The value of x :" +x + "\nThe value of y :" + y);
                break;
            case 2 : 
                y = ++x;
                System.out.println("Pre Increment : \n" +"The value of x :" +x + "\nThe value of y :" + y);
                break;
            case 3 : 
                 y = x--;
                 System.out.println("Post Decrement : \n" +"The value of x :" +x + "\nThe value of y :" + y);
                 break;
            case 4 :
                y = --x;
                System.out.println("Pre Decrement : \n" +"The value of x :" +x + "\nThe value of y :" + y);
                break;
            default : 
            System.out.println("Enter correct choice");
            break;
        }
        scan.close();
       
        
    }
    
}
