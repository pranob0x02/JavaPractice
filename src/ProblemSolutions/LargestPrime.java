package ProblemSolutions;

public class LargestPrime {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Calculate the largest prime factor of a given number: ");
//        int num = scanner.nextInt();
        
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int num) {
        int largestPrimeNum = 0;
        if (num <= 0 || num == 1) {
            return -1;
        } else {
            for (int i = 2; i <= num; i++) {
                while (num % i == 0) {
                    num = num / i;
                    largestPrimeNum = i;
                }
            }
            return largestPrimeNum;
        }
    }
}
