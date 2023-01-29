package ProblemSolutions;

public class FactorPrinter {
    public static void main(String[] args) {
//        printFactors(6);
        printFactors(32);
        printFactors(-1);
    }


    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("Factor for " + num + " is " + i);
                }
            }
            System.out.println("Factor for " + num + " is " + num);
            System.out.println("-------------------------");
        }
    }
}
