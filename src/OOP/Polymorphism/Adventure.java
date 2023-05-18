package OOP.Polymorphism;

public class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3),
                "Pleasant scene",
                "Scary music",
                "Something bad happened");
    }


    public void watchAdventure(){
        System.out.println("Watching an Adventure movie.......!");
    }

}
