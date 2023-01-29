package ProblemSolutions;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-22));
    }


    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }

        int evenDigit = 0;
        int sum = 0;
        while (num > 0) {
            evenDigit = num % 10;
            if (evenDigit % 2 == 0) {
                sum = sum + evenDigit;
            }
            num = num / 10;
        }
        return sum;
    }
}
