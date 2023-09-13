package Classes_Objects.Cylinder_Constructor;

public class CylinderMain {
    public static void main(String[] args) {
        
        Cylinder cy = new Cylinder();
        Cylinder cy1 = new Cylinder(20,30);

        Cylinder cy2 = new Cylinder();
        cy2.setRadius(10);
        cy2.setHeight(10);
        
        Cylinder cy3 = new Cylinder();
        cy2.setDimensions(100, 900);


        System.out.println("The radius of the cylinder is :" + cy.getRadius());
        System.out.println("The height of the cylinder is :" + cy.getHeight());
        System.out.printf("The Area of the Cylinder 1 is : %.2f \n ", cy.calculateTotalSurfaceArea());// functions
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n ", cy.calculateVolume());// function
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n", cy.calculateVolume());// function
        System.out.println(" ");
        

        System.out.println("The radius of the cylinder is :" + cy1.getRadius());
        System.out.println("The height of the cylinder is :" + cy1.getHeight());
        System.out.printf("The Area of the Cylinder 1 is : %.2f \n ", cy1.calculateTotalSurfaceArea());// functions
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n ", cy1.calculateVolume());// functions
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n ", cy1.calculateVolume());// functions
        System.out.println(" ");
        

        System.out.println("The radius of the cylinder is :" + cy2.getRadius());
        System.out.println("The height of the cylinder is :" + cy2.getHeight());
        System.out.printf("The Area of the Cylinder 1 is : %.2f \n ", cy2.calculateTotalSurfaceArea());// functions
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n ", cy2.calculateVolume());// function
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n", cy2.calculateVolume());// function
        System.out.println(" ");

        System.out.println("The radius of the cylinder is :" + cy3.getRadius());
        System.out.println("The height of the cylinder is :" + cy3.getHeight());
        System.out.printf("The Area of the Cylinder 1 is : %.2f \n ", cy3.calculateTotalSurfaceArea());// functions
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n", cy3.calculateVolume());// function
        System.out.printf("The Perimeter of the Cylinder 1 is : %.2f \n", cy3.calculateVolume());// function
        System.out.println(" ");
    
    }
    
}
