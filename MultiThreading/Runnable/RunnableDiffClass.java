package MultiThreading.Runnable;

public class RunnableDiffClass implements Runnable{
    
    public void run() {
        int i = 0 ;
        while(true){
            System.out.println(i + "Hello!.. I am from run Method");
            i++;
        }

    }
    
}
