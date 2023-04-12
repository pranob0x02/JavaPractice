package Cylinder;

public class TestCase {
    public static void main(String[] args) {


        Circle circle = new Circle(0);
        System.out.println("Circle.radius = " + circle.getRadius());
        System.out.println("Circle.Area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(0, 7.25);
        System.out.println("Cylinder.radius = " + cylinder.getRadius());
        System.out.println("Cylinder.height = " + cylinder.getHeight());
        System.out.println("Cylinder.area = " + cylinder.getArea());
        System.out.println("Cylinder.volume = " + cylinder.getVolume());
    }
}
