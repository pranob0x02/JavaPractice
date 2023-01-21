public class Sum3and5_challenge {
    public static void main(String[] args) {
        int sum = 0;
        int numbersMeetRequirement = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Numbers meet the requirement: " + i);
                numbersMeetRequirement++;
                sum = sum + i;
                if (numbersMeetRequirement == 5) {
                    break;
                }
            }
        }
        System.out.println("Total: " + sum);
    }
}
