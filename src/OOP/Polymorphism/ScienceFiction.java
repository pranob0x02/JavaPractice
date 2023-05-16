package OOP.Polymorphism;

public class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }


    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3),
                "Aliens do bad stuff",
                "Space guys chase Aliens",
                "Planet blows up....!");
    }





}
