package ReadingUserInput;

import java.util.Scanner;

public class MaxMinChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi There.......");
        double minNumber = 0;
        double maxNumber = 0;

        int loopCount = 0;

        System.out.println("--------------- Enter any number you can think of ---------------------");
        System.out.println("Press any character to exit the programme");

        while (true) {
            System.out.print("Number: ");

            try {
                double input = Double.parseDouble(scanner.nextLine());
                if (loopCount == 0 || input < minNumber) {
                    minNumber = input;
                }
                if (loopCount == 0 || input > maxNumber) {
                    maxNumber = input;
                }
                loopCount++;
            } catch (Exception e) {
                System.out.println("-----------------------");
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Minimum Value: " + minNumber);
            System.out.println("Maximum value: " + maxNumber);
        } else {
            System.out.println("No Valid Data Entered..........!!!!!");
        }
    }
}
