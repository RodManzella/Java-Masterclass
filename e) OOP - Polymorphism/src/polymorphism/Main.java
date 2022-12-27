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

        // We don´t have to change the type of theMovie variavble. It can stay as Movie. And this is because adventure is really a type of Movie.
        // A sublass, and inheritance lets us say Adventure is a Movie, and we can assign an Adventure movie to a Movie variable.

        Movie theMovie2 = new Adventure("Top Gun Maverick");
        theMovie2.watchMovie();
        // The code ran, the watchMovie method on the Adventure class. That´s because at runtime, the method that gets run is determined by the
        // JVM based on the runtime object and not this variable type. And that´s our first taste of polymorphism in this code.

        // We´ve declared our variable of type Movie, and assigned it an object that´s really an Adventure type of movie. And when we called
        // watchMovie on that, the behavior was the Adventure movies behavior.

        // Now, the method that´s on Adventure class, first calls Movie´s method, which is why we see that first statement "Top Gun Maverick is 
        // an Adventure filme". But this time we get the text that this is an Adventure film there, and this is the actual type of the object
        // at runtime. And then we have the plot stages for an Adventure Film, pleasant scene, scary music and the last one "something bad happens".
        
        
        // Up until now, we´ve always had the main method, or calling code, create instances of the object. But this time, we´ll create a method
        // on the Movie class, that the calling code can execute, that will return a movie instance for us. We´ll make this method public and static,
        // which means anybody can call this method to get a movie instance, based on the parameter type being passed in, and a title.
    }
    
    
}
