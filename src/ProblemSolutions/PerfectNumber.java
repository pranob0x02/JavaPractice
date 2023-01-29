package ProblemSolutions;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int num) {
        int perfectSum = 0;
        if (num < 1) {
            return false;
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    perfectSum = perfectSum + i;
                }
            }
            return perfectSum == num;
        }
    }
}

