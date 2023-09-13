package Interfaces.StoreExample;


public class Store {

    IMember m[] = new IMember[100];
    int count = 0;

    void register(IMember member){

        m[count ++] = member;

    }
    void inviteCustomerSale(){

        for(int i = 0 ; i < count ; i ++){
            
            m[i].callBack();
        }
    }
    
}
