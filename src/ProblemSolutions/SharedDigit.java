package ProblemSolutions;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(23, 12));
        System.out.println(hasSharedDigit(16, 25));
        System.out.println(hasSharedDigit(-1, 1));
    }


    public static boolean hasSharedDigit(int a, int b) {
        if ((10 > a || a > 99) || (10 > b || b > 99)) {
            return false;
        }
        int aFirstDigit = a % 10;
        int bFirstDigit = b % 10;
        int aLastDigit = a / 10;
        int bLastDigit = b / 10;
        if (aFirstDigit == bFirstDigit || aFirstDigit == bLastDigit) {
            return true;
        } else if (aLastDigit == bFirstDigit || aLastDigit == bLastDigit) {
            return true;
        }
        return false;
    }
}
