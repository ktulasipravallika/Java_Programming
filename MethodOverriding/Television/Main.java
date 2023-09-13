package MethodOverriding.Television;

public class Main {

    public static void main(String[] args) {
        
        OldTV ot = new OldTV();

        SmartTV st = new SmartTV();

        OldTV ott = new SmartTV();

        ot.switchOn();
        ot.switchOff();
        st.switchOn();
        st.switchOff();
        st.browsing();
        ott.switchOn();
        ott.switchOff();
      //  ott.browsing(); - not allowed for the subclass object with reference of parent class.
    }
    
}
