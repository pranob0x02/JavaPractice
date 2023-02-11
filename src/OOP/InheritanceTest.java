package OOP;

public class InheritanceTest {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.setConvertible(false);
//        car.describeCar();

        Account myTestAccount = new Account();
        //Empty constructor

        Account myAccount = new Account("123456789", 500, "Pranob", "pranob@gmail.com", "54290842");
        //constructor with parameter

        Account myAnotherTestAccount = new Account("Mihir", "mihir@gmail.com", "+8801817720109");

        //Consturctor overloadingTest
        System.out.println(myAnotherTestAccount.getBalance());
    }
}
