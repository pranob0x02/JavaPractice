public class PrintFormation {

    public static void main(String[] args) {


        printInformation("Hello World");
        String HelloWorld = "Hello World";
        String HelloWorldLower = HelloWorld.toLowerCase();

        if (HelloWorldLower.equals(HelloWorld)){
            System.out.println("values match exactly");

        }

        if (HelloWorld.equalsIgnoreCase(HelloWorld)){
            System.out.println("Values match ignoring case");
        }

        if (HelloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if (HelloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if (HelloWorld.contains(" ")){
            System.out.println("String containes _ (space)");
        }



    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }



}
