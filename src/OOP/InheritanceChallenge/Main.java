package OOP.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee test = new SalariedEmployee("test", "11/11/1985", "01/01/2020", 35000);
        System.out.println(test);
        System.out.println("Age = " + test.getAge());
        System.out.println("Paycheck = " + test.collectPay());
        test.retire();
        System.out.println("Pension check = " + test.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println(mary.getAge());
        System.out.println("Paycheck = " + mary.collectPay());
        System.out.println("Holiday pay = " + mary.getDoublePay());

//        Rectangle test = new Rectangle();
//        System.out.println(test);
    }
}
