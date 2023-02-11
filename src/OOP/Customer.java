package OOP;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    //  getterMethod

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    //  constructor

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //  no args constructor that calls another constructor,
    //    passing some literal values for each argument.
    public Customer() {
        this("TestCustomer", 00.00, "test@gmail.com");
    }


    // constructor with just name and email parameter
    public Customer(String name, String email) {
        this(name, 00.00, email);
    }
}
