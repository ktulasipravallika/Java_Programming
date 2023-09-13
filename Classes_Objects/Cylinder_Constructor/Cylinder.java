package Classes_Objects.Cylinder_Constructor;

public class Cylinder {

    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;

    }

    public void setRadius(double r) {
        if (radius < 0) {
            radius = 0;
        } else {
            radius = r;
        }
    }

    public void setHeight(double h) {

        if (height < 0) {
            height = 0;
        } else {
            height = h;
        }
    }

    public void setDimensions(double r, double h) {
        if (radius < 0) {
            radius = 0;
        } else if (height < 0) {
            height = 0;
        } else {
            height = h;
            radius = r;
        }
    }

    public Cylinder() {
        radius = 1;
        height = 1;
    }

    public Cylinder(int r) {
        radius = r;
        height = 1;

    }

    public Cylinder(int r, int h) {
        radius = r;
        height = h;

    }

    public double calculateLidArea() {
        return (Math.PI * radius * radius);
    }

    public double calculateTotalSurfaceArea() {
        return 2 * calculateLidArea() + calculateCircumference() * height;

    }

    public double calculateVolume() {
        return calculateLidArea() * height;

    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
