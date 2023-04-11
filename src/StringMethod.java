public class StringMethod {

    public static void main(String[] args) {

        String birthDate = "30/03/1998";
        int startingIndex = birthDate.indexOf("1998");
        System.out.println("StartingIndex = " + startingIndex);
        System.out.println("Birth Year = " + birthDate.substring(startingIndex));


        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "30", "03", "1998");
        System.out.println(newDate);


    }

}

