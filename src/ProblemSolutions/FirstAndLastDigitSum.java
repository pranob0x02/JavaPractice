package ProblemSolutions;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }


    public static int sumFirstAndLastDigit(int num) {
        int sum = 0;
        int lastDigit = 0;
        int firstDigit = 0;

        if (num < 0) {
            return -1;
        }

        lastDigit = num % 10;
        while (num > 0) {
            num = num / 10;
            if (num < 9) {
                firstDigit = num;
                sum = firstDigit + lastDigit;
                break;
            }
        }
        return sum;
    }
}
