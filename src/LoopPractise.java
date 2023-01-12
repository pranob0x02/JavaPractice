public class LoopPractise {
    public static void main(String[] args) {
        /*
         * for (init; expression; increment){
         *     //block of statements
         * }
         */
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

//        for (double rate = 2.0; rate <= 5.0; rate++) {
//            double interest = getInterest(10000.0, rate);
//            System.out.println(interest);
//        }

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = getInterest(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println(getInterest(100.0, rate));
        }


    }

    public static double getInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
