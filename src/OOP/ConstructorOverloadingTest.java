package OOP;

public class ConstructorOverloadingTest {

    public static void main(String[] args) {
        Customer test1 = new Customer("pranob", 100, "pranob@gmail.com");
        System.out.println(test1.getEmail() + " " + test1.getName() + " " + test1.getCreditLimit());

        Customer test2 = new Customer();
        System.out.println(test2.getEmail() + " " + test2.getName() + " " + test2.getCreditLimit());

        Customer test3 = new Customer("Mihir", "mihir@gmail.com");
        System.out.println(test3.getEmail() + " " + test3.getName() + " " + test3.getCreditLimit());
    }
}
