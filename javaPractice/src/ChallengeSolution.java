public class ChallengeSolution {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2002));

        System.out.println("sum " + hasEqualSum(1, -1, 0));
    }

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else {
            return false;
        }
    }
}
