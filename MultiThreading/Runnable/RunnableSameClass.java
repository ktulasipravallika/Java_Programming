package MultiThreading.Runnable;

public class RunnableSameClass implements Runnable {
    public void run() {
        int i = 0 ;
        while(true){
            System.out.println(i + "Hello!.. I am from run Method");
            i++;
        }

    }
    public static void main(String[] args) {
        RunnableSameClass rsc = new RunnableSameClass();
        Thread t = new Thread(rsc);
        t.start();
        int i = 0 ;
        while(true){
            System.out.println(i + "World!.. I am from Main Method");
            i++;
        }
    }
    
}
