package OOP.Polymorphism.Challenge2;

public class TestCar {
    public static void main(String[] args) {

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());


    }
}
