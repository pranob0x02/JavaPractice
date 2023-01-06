public class MethodOverLoading {

    // Method overloading occurs when a class has multiple methods, with the same name but
    // the methods are declared with different parameters.

    //Parameter names are not important when determining if a method is overloaded.

    public static void main(String[] args) {
        calculateScore("Pranob", 90);
        System.out.println(calculateScore("pranob", 90));
        System.out.println("newScore " + calculateScore(80));
    }

    public static int calculateScore(String name, int score) {
        System.out.println(name + " got " + score);
        return score * 100;
    }

    public static int calculateScore(int score) {
        return score;
    }

}
