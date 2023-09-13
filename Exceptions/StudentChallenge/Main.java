package Exceptions.StudentChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        try(Scanner scan = new Scanner(System.in)){

            Stack st = new Stack(5);

            try{
                st.push(51);
                st.push(51);
                st.push(51);
                st.push(51);
                st.push(51);
                st.push(51);
                st.push(51);

                st.pop();
                st.pop();
                st.pop();
                st.pop();
                st.pop();
                st.pop();

            }
            
            catch(StackOverFlow e){
                System.out.println(e);

            }
            catch(StackUnderFlow e){
                System.out.println(e);
            }
        }
    }
    
}
