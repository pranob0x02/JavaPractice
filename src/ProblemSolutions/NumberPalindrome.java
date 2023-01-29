package ProblemSolutions;

public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(112));
    }

    public static boolean isPalindrome(int num) {
        int lastDigit = 0;
        int reverse = 0;

        if (num < 0) {
            num = num * -1;
        }
        int stored = num;
        while (stored > 0) {
            lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored = stored / 10;
        }
        if (reverse == num) {
            return true;
        } else {
            return false;
        }
    }
}
