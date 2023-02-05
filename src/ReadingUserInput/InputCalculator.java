package ReadingUserInput;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int numberCount = 0;

        while (true) {

            try {
                System.out.print("Enter desired number: ");
                double input = Double.parseDouble(scanner.nextLine());
                numberCount++;

                sum = sum + input;
            } catch (Exception e) {

                average = (sum / numberCount);
                break;
            }
        }

        System.out.println("SUM = " + sum + " " + "AVG = " + average);
    }
}
