package OOP.Polymorphism;

import java.util.Scanner;

public class TestMovie {

    public static void main(String[] args) {

        /*
        * The ability to execute different behavior, for different types, which are determined at runtime.
        *
        *   Movie movie = Movie.getMovie(type, title);
        *   movie.watchMovie();
        *
        * */


////        Movie movie = new Movie("StarWars");
////        movie.watchMovie();
//
//        Movie adventureMovie = new Adventure("Starwars");
//        adventureMovie.watchMovie();

//        Movie movie = Movie.getMovie("Comedy", "StarWars");
//        movie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter type (A for Adventure, C for Comedy, S for ScienceFiction) OR Q to quit: ");
            String type = s.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie Title: ");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();

        }
    }
}
