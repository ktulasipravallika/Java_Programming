package MultiThreading.Threads;

public class ThreadsSameClass extends Thread {

    public static void main(String[] args) {

        int i=0 ;
        ThreadsSameClass tsc = new ThreadsSameClass();
        tsc.start();
        while(true){
            System.out.println(i + "Hello!.. I am from Main Method..");
            i++;
        }
        
    }

    public void run() {
        int i = 0;
        while(true){
            System.out.println(i + "World!.. I am from run Method..");
            i++;
        }
    }
}
