public class SwitchTest {
    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");

            case 2 -> System.out.println("value was 2");

            case 3, 4, 5 -> System.out.println("the value was " + switchValue);
            default -> System.out.println("was neither");
        }

        System.out.println(getQuarter("January"));

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> {
                yield "1st";
                //Switch statement is being used as a switch expression returning a value.
                //Case label uses a code block, with opeining and closingn curly braces.
            }
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "Decmeber" -> "4rd";
            default -> {
                String badResponse = "404 NOT FOUND " + month;
                yield badResponse;
            }
        };


    }


}
