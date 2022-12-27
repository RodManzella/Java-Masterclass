package polymorphism;

public class Main {
    
    public static void main(String[] args) {
        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();

        // we get the output that Star Wars is a movie film. And that´s because the runtime instance of the movie variable is the Movie
        // class. It´s the object we created here in the main method, and we did new Movie, which means it´s really an instance of a Movie.
        //Here, we´ve created the object using the new Movie statement and past it the title of Star Wars.
        // And then we assigned our movie instance to a movie reference variable, and here we just called it theMovie.

        // What we´ll do next is add some subclasses of movies that represent different genres or classifications of Movies.
    }
    
    
}
