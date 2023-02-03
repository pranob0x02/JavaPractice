package ReadingUserInput;

import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args) {
        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
//            System.out.println(e + " occurred! What did you do?");
        }

//        System.out.println(getInputFromConsole(20));
        //NullPointerException
    }


    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Welcome " + name);

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are " + age + " years old.";
    }


    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);

        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are " + age + " years old.";
    }


    /*
     *      ---------------- Instantiating Scanner ----------------
     *           Scanner s = new Scanner(System.in)
     *
     *       --------------- For reading input from a file -----------
     *           Scanner s = new Scanner (new File("nameOfFile"));
     *
     * */
}
