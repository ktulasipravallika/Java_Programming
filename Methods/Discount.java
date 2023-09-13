package Methods;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Discount ds = new Discount();

        double A[] = new double[5];

        System.out.println("Enter the prices of 5 items : ");
        for (int i = 0; i < 5; i++) {
            A[i] = scan.nextDouble();
        }

        System.out.println("The discount for the enetered prices is :" + ds.discount(A));

        System.out.println("The discount is : " + ds.discount());
        System.out.println("The discount is : " + ds.discount(500, 500));
        System.out.println("The discount is : " + ds.discount(300, 400, 800, 900));
        System.out.println("The discount is : " + ds.discount(500, 900));
        System.out.println("The discount is : " + ds.discount(500, 60));
        
        scan.close();
    }

    double discount(double... prices) {

        double discount = 0.0;
        double sum = 0;

        if (prices.length == 0)
            return 0;
        else {
            for (int i = 0; i < prices.length; i++) {
                sum = sum + prices[i];
            }

            if (sum >= 1000 && sum <= 2000) {
                return discount = 10;
            }

            else if (sum > 2000) {
                return discount = 20;
            } else {
                return discount;
            }
        }
    }

}
