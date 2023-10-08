package polymorphism;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
            Scanner s = new Scanner(System.in);

            while(true){
                System.out.println("Enter type(A for Adventure, C for comedy, "+
                            "S for Science Fiction, or Q to quit): ");
                String type = s.nextLine();
                if("Qq". contains(type)){
                    break;
                }
                System.out.println("Enter movie title: ");
                String title = s.nextLine();
                Movie movie = Movie.getMovie(type, title);
                movie.watchMovie();
            }
            //EX: entering S for Science fiction:
            // title: Star Wars
            // Look at the output for the Star-Wars Science Fiction movie. The code called the method watchMovie() using a Movie reference
            // variable. But an runtime, the Movie wasn´t really a movie, it was an instance of the subclass, the ScienceFiction class.
            // And it was the method watchMovie() that´s actually declared on the ScienceFiction class, that really got executed. This is
            // polymorphism in action.

            // Our compiled code, in the main method of the Main class, never knew anything about the ScienceFiction class, or any of the other
            // subclasses. But at runtime, we got an object of type ScienceFiction back from the factory method. And when the method watchMovie()
            // was called on that, it called watchMovie on the ScienceFiction class.

            // And don´t forget, the watchMovie method on ScienceFiction, first called the method on Movie, and we can see that first output
            // statement, "Star-Wars is a ScienceFiction film". this got printed because we called super.watchMovie(), when we overrode that
            // method, on the ScienceFiction class.




         Movie theMovie = new Movie("Star Wars");
         theMovie.watchMovie();
         System.out.println();

        // we get the output that Star Wars is a movie film. And that´s because the runtime instance of the movie variable is the Movie
        // class. It´s the object we created here in the main method, and we did new Movie, which means it´s really an instance of a Movie.
        //Here, we´ve created the object using the new Movie statement and past it the title of Star Wars.
        // And then we assigned our movie instance to a movie reference variable, and here we just called it theMovie.

        // What we´ll do next is add some subclasses of movies that represent different genres or classifications of Movies.

        // We don´t have to change the type of theMovie variavble. It can stay as Movie. And this is because adventure is really a type of Movie.
        // A sublass, and inheritance lets us say Adventure is a Movie, and we can assign an Adventure movie to a Movie variable.

         Movie theMovie2 = new Adventure("Top Gun Maverick");
         theMovie2.watchMovie();
         System.out.println();

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

         Movie theMovie3 = Movie.getMovie("Adventure", "Star Wars");
         theMovie3.watchMovie();
         System.out.println();

        // We see that we really do get an Adventure object back, because you can see Adventure film on the first line, when executed.
        // The getMovie static method returned an instance, which we maybe didn´t know what it was, and maybe don´t really care. But because
        // the runtime object was an instance of the Adventure class, the method on that class was executed.

        // With the getMovie method, the calling code doesn´t really need to know about each subclass, or how to create different instances of movies.
        // We can just call this method, passing the type and name, and the right object type is instantiated and returned, but it´s assigned to a
        // variable with the Movie type, so this code will work for any Movie, or any of it´s subclasses, including subclasses that haven´t even been
        // created yet.
        // This keeps all the information about Movie and it´s subclasses, in the control of the Movie class, and simplifies the work that needs
        // to be done, by the calling code.
    }
    
    
}
