package ProblemSolutions;

public class FlourPackProblem {
    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        // since bigCount is 1 (bigBag of 5kilos) and goal is 4 kilos

        System.out.println(canPack(1, 0, 5));
        // since bigCount is 1 and goal is 5 kilos also

        System.out.println(canPack(0, 5, 4));
        // since smallCount is 5(small bags of 1 kilo) and goal is 4 kilos
        // we have 1 bag left which is ok!

        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
            //Cannot have negative kilos of flour
        } else {
            int sum = (5 * bigCount) + smallCount;
            if (sum < goal) {
                return false;
            } else if (goal % 5 <= smallCount) {
                return true;
                //if the remaining number of small count bags is less than small count return ture
            }
        }
        return false;
    }
}
