package MultiThreading.Threads;

public class ThreadsDiffClass extends Thread {

    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + "Hello!... I am from the run method..");
            i++;
        }
    }
}
