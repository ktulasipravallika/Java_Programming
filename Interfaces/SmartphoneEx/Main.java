package Interfaces.SmartphoneEx;

public class Main{
    public static void main(String[] args) {
        
        SmartPhone sp = new SmartPhone();

        Phone p = sp;
        ICamera ic = sp;
        IMusicPlayer imp = sp;

        sp.call();
        sp.click();
        sp.display();
        sp.stop();
        sp.play();
        sp.record();
        sp.sms();
        sp.videoCall();

        System.out.println(" \n ");

        p.display();
        p.sms();

        System.out.println(" \n ");

        ic.click();
        ic.record();

        System.out.println(" \n ");

        imp.stop();
        imp.play();

    }

}