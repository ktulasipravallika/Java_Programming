package Interfaces.SmartphoneEx;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer {

        
        void videoCall(){

            System.out.println("The SmartPhone is doing Video Call" );
        }
        @Override
        public void click(){
            System.out.println("The SmartPhone is Clickin " );

        }
        @Override
        public void record(){
            System.out.println("The SmartPhone is recording" );
            
        }
        @Override
        public void play(){
            System.out.println("The SmartPhone is Playing song" );
            
        }
        @Override
        public void stop(){
            System.out.println("The SmartPhone is stopping song" );
            
        }
        
        public void call(){
            System.out.println("The SmartPhone is calling " );
            
        }
        @Override
        public void sms(){
            System.out.println("The SmartPhone is doing sms" );
            
        }
    }