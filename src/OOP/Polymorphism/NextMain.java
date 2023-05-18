package OOP.Polymorphism;

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // cast to 'Adventure'
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
//        comedy.watchMovie();

        /*
        *   Local variable type inference was introduced in java 10
        * */

        var ariplane = Movie.getMovie("C", "airplane");
        ariplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }
        else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }
        else if (unknownObject instanceof ScienceFiction sci_fi){
            //  ScienceFiction sci_fi
            //  pattern matching for the instanceof operator

            sci_fi.watchScienceFiction();
        }

        // instanceof operator lets you test the type of an object or instance.
        // unknownObject instanceof Adventure



    }
}
