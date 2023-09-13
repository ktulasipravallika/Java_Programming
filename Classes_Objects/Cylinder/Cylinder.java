package Classes_Objects.Cylinder;

public class Cylinder {

    public double radius;
    public double height;

    public double calculateLidArea(){
            return(Math.PI * radius * radius);
        }

    public double calculateTotalSurfaceArea(){
            return 2 * calculateLidArea() + calculateCircumference() * height;

        }
    public double calculateVolume(){
       return calculateLidArea() * height;

    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius; 
 
     }
}
    

