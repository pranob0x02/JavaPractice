package ReadingUserInput;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.print("Enter number #" + counter + " : ");
            String nextNum = scanner.nextLine();
//            int number = scanner.nextInt();
            try {
//                int number = Integer.parseInt(nextNum);
                int number = Integer.parseInt(nextNum);
                counter++;
                sum = sum + number;
            } catch (Exception e) {
                System.out.println("Invalid number format!!!!");
            }
        }
        System.out.println("Total sum: " + sum);
    }
}
