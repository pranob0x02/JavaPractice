public class StringVsStringBuilder {
    public static void main(String[] args) {


        String helloWorld = "Hello " + "World";
        helloWorld.concat(" and good bye!");

//        StringBuilder helloWorldBuilder = "Hello" + "World";

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and good bye!");

        helloWorldBuilder.reverse().setLength(7);
        System.out.println(helloWorldBuilder);


        printInformation(helloWorldBuilder);
        printInformation(helloWorld);


        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));


        StringBuilder emptyStart123 = new StringBuilder(32);
        emptyStart123.append("a".repeat(17));


        printInformation(emptyStart);
        printInformation(emptyStart123);






    }


    public static void printInformation(String string){

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());

        System.out.println("Capacity = " + builder.capacity());
    }
}
