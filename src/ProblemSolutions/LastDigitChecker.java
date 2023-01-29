package ProblemSolutions;

public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(41, 42, 44));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        int cLastDigit = c % 10;

        if ((10 > a || a > 1000) || (10 > b || b > 1000) || (10 > c || c > 1000)) {
            return false;
        } else if ((aLastDigit == bLastDigit) || (aLastDigit == cLastDigit) || (bLastDigit == cLastDigit)) {
            return true;
        }
        return false;
    }
}
