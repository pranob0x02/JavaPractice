package ProblemSolutions;


public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }


    /*
     * Euclid's algorithm:
     *   --> subtracting larger number by smaller
     *       (each time replacing larger number with the subtraction result)
     *       until getting two equal numbers which will be your greatest common divisor !!!! (^_^)
     *
     * */

    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return b;
    }
}
