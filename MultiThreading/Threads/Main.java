package MultiThreading.Threads;

public class Main {

    public static void main(String[] args) {
        
        ThreadsDiffClass tdc = new ThreadsDiffClass();
        tdc.start();
        int i = 0;
        while (true) {
            System.out.println(i + "World!... I am from the Main Method..");
            i++;
        }

    }
    
}
