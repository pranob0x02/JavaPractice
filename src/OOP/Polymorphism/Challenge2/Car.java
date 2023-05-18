package OOP.Polymorphism.Challenge2;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    // getClass().getSimpleName()

    public String startEngine(){
        return getClass().getSimpleName() + " engine is starting......!";
    }

    public void accelerate(){
        System.out.println(getClass().getSimpleName() + " is accelerating");
    }

    public void brake(){
        System.out.println(getClass().getSimpleName() + " is breaking");
    }

}
