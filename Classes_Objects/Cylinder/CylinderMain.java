package Classes_Objects.Cylinder;

import java.util.Scanner;

public class CylinderMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cylinder cy = new Cylinder();
        Cylinder cy1 = new Cylinder();
        
        System.out.println("Enter the height of the Cylinder 1 : ");
        cy.height = scan.nextDouble();//property

        System.out.println("Enter the radius of the Cylinder 1 : ");
        cy.radius = scan.nextDouble();//property


        System.out.printf("The Area of the Cylinder 1 is : %.2f \n", cy.calculateTotalSurfaceArea());// functions
        System.out.printf("The Perimeter of the Cylinder 1 is :%.2f \n", + cy.calculateVolume());// functions


        System.out.println("Enter the height of the Cylinder 2 : ");
        cy1.height = scan.nextDouble();//property

        System.out.println("Enter the radius of the Cylinder 2 : ");
        cy1.radius = scan.nextDouble();//property


        System.out.printf("The Area of the Cylinder 1 is : %.2f \n ", cy1.calculateTotalSurfaceArea());// functions
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f ", cy1.calculateVolume());// functions
    
        
       
        scan.close();
    }

    
}
