public class WhileLoopChallenge {

    public static void main(String[] args) {
        int num = 4;
        int finishNumber = 20;
        while (num <= finishNumber) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }
            System.out.println(isEvenNumber(num));
        }
    }


    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
