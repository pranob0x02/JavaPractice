public class WhileLoopChallenge {

    public static void main(String[] args) {
        int num = 4;
        int evenNumberCount = 0;
        int oddNumberCount = 0;

        while (num <= 20) {
            num++;
            if (!isEvenNumber(num)) {
                oddNumberCount++;
                continue;
            }
            System.out.println("Even number is " + num);
            evenNumberCount++;
            if (evenNumberCount == 5) {
                break;
            }
        }
        System.out.println("Total odd Numbers found: " + oddNumberCount);
        System.out.println("Total even Numbers found: " + evenNumberCount);
    }


    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }


    /*
     * step 2
     * calculate total number of even and odd numbers.
     * break out of the loop, once 5 even numbers are found.
     * display total number of odd and even numbers found.
     * */
}
