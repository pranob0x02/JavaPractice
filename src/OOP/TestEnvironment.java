package OOP;

public class TestEnvironment {

    public static void main(String[] args) {
        
        Carpet carpet = new Carpet(3.5);
        System.out.println(carpet.getCost());

        Floor floor = new Floor(2.75, 4.0);
        System.out.println(floor.getArea());

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total " + calculator.getTotalCost());
    }
}
