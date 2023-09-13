package Inheritance.Cuboid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the cuboid :");
        double l = scan.nextDouble();

        System.out.println("Enter the breadth of the cuboid :");
        double b = scan.nextDouble();

        System.out.println("Enter the height of the cuboid :");
        double h = scan.nextDouble();

        Cuboid c = new Cuboid();
        Cuboid c1 = new Cuboid(h);
        Cuboid c2 = new Cuboid(l , b , h);

        System.out.println("The Volume of the CUboid 1 is :" + c.calculateVolume() );
        System.out.println("The Volume of the CUboid 2 is :" + c1.calculateVolume() );
        System.out.println("The Volume of the CUboid 3 is :" + c2.calculateVolume());
        
        scan.close();
    }
    
}
