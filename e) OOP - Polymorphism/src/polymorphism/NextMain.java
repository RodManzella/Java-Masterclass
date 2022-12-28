package polymorphism;

public class NextMain {
    public static void main(String[] args) {
        
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // First, we´re creating a variable with the Movie type, and we´ve called it movie.
        // We then assigned the result of this static method, Movie.getMovie, to that variable.

        // Adventure jaws = Movie.getMovie("A", "Jaws");
    }
    
}
