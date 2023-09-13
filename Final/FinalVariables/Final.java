package Final.FinalVariables;

public class Final {

    static final double PI = 3.14;// 1 st way of initialising 

    final double x; // 2 nd way of initialising 
    {
        x = 8.9009;
    }

    static final double y;

    static{// 3 rd way of initialising 

        y = 89.3423;
    }

    final double c;

    Final(){// 4 th way of initialising 

        c = 3241.53425;
    }
    public static void main(String[] args) {

        System.out.println("The value of Pi is :" + PI);
       // System.out.println("The value of x is :" + x);
        System.out.println("The value of y is :" + y);
      //  System.out.println("The value of c is :" + c);

    }
    
}
