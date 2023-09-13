package Methods;

public class SumOfElelemts {
    public static void main(String[] args) {

        SumOfElelemts se = new SumOfElelemts();
       System.out.println(" " + se.sum() + " \n " + se.sum(10,20) 
       + " \n " + se.sum(10, 20, 30) + " \n " + se.sum(10,20,30,40,50));
      
    }

    int sum(int ... x){
        int sum = 0;
        if(x.length==0)
            return 0;
        else{
            for(int i =0; i < x.length ; i++){
            sum = sum + x[i]; 
        }
    }
        return sum;
    }
    
}
