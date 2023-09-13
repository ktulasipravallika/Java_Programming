package Static.StaticVarMethods;

import java.util.Scanner;

public class Car { 
    static int cost = 1000;
    int a , b ;
    static double onRoadPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tax in your area");
        double tax = scanner.nextDouble();
        scanner.close(); 
        return cost + cost * tax;

    }
    
}
