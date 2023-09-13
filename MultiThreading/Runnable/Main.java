package MultiThreading.Runnable;

public class Main {
    public static void main(String[] args) {

        RunnableDiffClass rdc = new RunnableDiffClass();
        Thread t = new Thread(rdc);
        t.start();
        int i = 0 ;
        while(true){
            System.out.println(i + "World!.. I am from Main Method");
            i++;
        }
    }
    
    
}
