public class SwitchTest {
    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("the value was " + switchValue);
                break;
            default:
                System.out.println("was neither");
                break;
        }

    }
}
