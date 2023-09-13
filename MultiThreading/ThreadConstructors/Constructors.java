package MultiThreading.ThreadConstructors;

public class Constructors extends Thread {

    public Constructors(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY-2);
    }

    public void run() {
        int i = 1;
        while(true){
            System.out.println("HI I am from Constructors Class Method :" + i);
            i++;
            /* try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            } */
            
        }
    }
    
}
