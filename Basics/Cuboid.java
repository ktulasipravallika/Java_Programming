import java.util.*;

public class Cuboid {
    
        public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the cuboid:");
        float l = scan.nextFloat();

        System.out.print("Enter the breadth of the cuboid:");
        float b = scan.nextFloat();

        System.out.print("Enter the height of the cuboid:");
        float h = scan.nextFloat();
         
        float totalArea = 2 * ((l*b) +(b*h) + (l*h));
        System.out.print("The area of the cuboid is :" + totalArea + "\n");
        
        float volume = l*b*h;
        System.out.print("The volume of the cuboid is :" + volume);

        scan.close();
    }
}
