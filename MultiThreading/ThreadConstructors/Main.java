package MultiThreading.ThreadConstructors;

public class Main {
    public static void main(String[] args) {

        Constructors c = new Constructors("My_First_Thread");

        System.out.println(" ID is : " + c.getId());
        System.out.println("Name is : " + c.getName());
        System.out.println("Priotity is :" + c.getPriority());
        System.out.println("State is :" + c.getState());
        System.out.println("Is Alive :" + c.isAlive());
        c.setDaemon(true);// least priotitized, so when main method is completed, it will not wait for the
                          // completionof the daemon thread(run method)
        c.start();
        // c.interrupt();
       // Thread mainThread = Thread.currentThread();
        /*
         * try{
         * mainThread.join();
         * }
         * catch(InterruptedException e){
         * System.out.println(e);
         * }
         */

        int i = 1;
        while (true) {
            System.out.println("HI I am from Main Method :" + i);
            Thread.yield();
            i++;
        }
    }

}
