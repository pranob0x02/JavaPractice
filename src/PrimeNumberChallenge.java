import java.lang.Math;

public class PrimeNumberChallenge {
    public static void main(String[] args) {

        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(33));


    }

    /*
     * given number not be divisible by
     * {2 till (givenNumber-1)}
     * */

//    public static boolean isPrime(int num) {
//        if (num < 2) {
//            return false;
//        }
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    // ******************** Improved Version **********************
    //This is done because the square root of a number is the highest number that can divide it without leaving a remainder.
    // So, if a number is not divisible by any number from 2 to its square root,
    // it is guaranteed that it is not divisible by any number higher than its square root.

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



