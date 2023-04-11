public class StringFormatting {
    public static void main(String[] args) {
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point:
                    \u2022 Second Point:
                """;

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        // %n -> creates a new line

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
