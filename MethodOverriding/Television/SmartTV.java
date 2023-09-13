package MethodOverriding.Television;

public class SmartTV extends OldTV {

    @Override
    void switchOn(){
        System.out.println("Smart TV switched On");
    }
    
    @Override
    void switchOff(){
        System.out.println("Smart TV switched Off");
    }

    void browsing(){
        System.out.println("Smart Tv browsing.....");
    }
    
}
