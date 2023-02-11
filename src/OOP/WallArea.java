package OOP;

public class WallArea {
    public static void main(String[] args) {
        Wall test1 = new Wall();
        System.out.println(test1.getArea());

        Wall test2 = new Wall(-1.5, -2.0);
        System.out.println(test2.getArea());

        Wall test3 = new Wall(2, 3);
        System.out.println(test3.getArea());
    }
}
