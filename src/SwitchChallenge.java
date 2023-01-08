public class SwitchChallenge {
    public static void main(String[] args) {
        getSwitch('G');
//        System.out.println(getSwitch('A'));
        printDayOfWeek(3);
    }

    public static void getSwitch(char x) {
        switch (x) {
            case 'A' -> System.out.println(x + " is Able");
            case 'B' -> System.out.println(x + " is Baker");
            case 'C' -> System.out.println(x + " is Charlie");
            case 'D' -> System.out.println(x + " is Dog");
            case 'E' -> System.out.println(x + " is Easy");
            default -> System.out.println("Oops! Something went wrong!!!!");
        }
    }

//    public static String getSwitch(char x) {
//        return switch (x) {
//            case 'A' -> x + " is Able";
//            case 'B' -> x + " is Baker";
//            case 'C' -> x + " is Charlie";
//            case 'D' -> x + " is Dog";
//            case 'E' -> x + " is Easy";
//            default -> "Oops! Not Found!";
//        };
//    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day!";
        };

        System.out.println(day + " Stands for " + dayOfWeek);
    }
}
