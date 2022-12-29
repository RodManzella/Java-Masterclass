package polymorphism;

public class NextMain {
    public static void main(String[] args) {
        
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // First, we´re creating a variable with the Movie type, and we´ve called it movie.
        // We then assigned the result of this static method, Movie.getMovie, to that variable.

        // Adventure jaws = Movie.getMovie("A", "Jaws");

        //Now, this code doesn´t compile^^^. IntelliJ tells us that the Required Type is adventure, and Provided is Movie. Why is this a
        // problem? 
        //First of all, the compiler isn´t going to run the code to figure out what will realy happen.
        // It has to be satisfied with making assumptions about the code, based on how we write the code.
        // In this case, we declared that the method, getMovie, is going to return a Movie Class.
        // We didn´t say it was going to return an instance of the Adventure Class.
        // The compiler asks the question, can every kind of Movie(which is the return type of this method), be called an Adventure, meaning
        // can every kind of Movie be assigned to an Adventure variable?
        // The answer is no. The adventure reference jaws, would not be able to handle a Comedy movie, if that got returned, for example.
        // That´s because we can´t say a Comedy is an Adventure.
        // But we absolutely know that when we pass the letter A as the type, that we´ll get an Adventure movie back.
        // But the compiler can´t figure that out, without executing code, and it´s not going to do that.

        // Now, we can give the compiler more detailed instructions, to get around this issue. One way to do this is with casting. Like casting
        // with primitives, we can cast instances.

        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        // We can see that it runs just like it did, in the two lines above these. But what happens if we make a mistake, and pass a C as the
        // type? We know that doing that, should give us a comedy movie, but let´s not change anything else, and just see what happens.

        // Adventure jaws = (Adventure)Movie.getMovie("C", "Jaws");
        // jaws.watchMovie();

        // This code compiles, but if we run it we get a special kind of exception, a Class Cast exception. And the message is pretty informative
        // that we got a Comedy object, when an Adventure objectn was expected. This is a bad situation, to have your code compile, but then get
        // exceptions at runtime.

        // Maybe you´re asking, when can you
    }
    
}
