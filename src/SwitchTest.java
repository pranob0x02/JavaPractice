public class SwitchTest {
    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");

            case 2 -> System.out.println("value was 2");

            case 3, 4, 5 -> System.out.println("the value was " + switchValue);
            default -> System.out.println("was neither");
        }

    }
}
