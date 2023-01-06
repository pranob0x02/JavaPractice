public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(561601);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        long years = minutes / (60 * 24 * 365);
        long yearsRemaining = minutes % (60 * 24 * 365);
        long days = yearsRemaining / (60 * 24);

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

}
