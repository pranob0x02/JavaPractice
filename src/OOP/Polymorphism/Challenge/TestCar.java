package OOP.Polymorphism.Challenge;

public class TestCar {

    public static void main(String[] args) {

//        Car car = new Car("2022 Blue Ferrari");
//        runRace(car);

        Car Ferrai = new GasPoweredCar("2022 Blue Ferrari", 15.4, 6);
        runRace(Ferrai);

        Car Tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(Tesla);



    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }

}
