public class MainChallenge {


    public static void main(String[] args) {

        System.out.println("The highScore is " + calculateScore(true, 4000, 2, 100));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }


}