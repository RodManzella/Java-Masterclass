package polymorphism;

public class Movie {
    
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
            String instanceType = this.getClass().getSimpleName();
            // You´ve seen the use of the keyword this before, which refers to the current instance, and now we´re calling a method on that,
            // called getClass(). The method getClass() is on Java Linked object, which we´ve talked about. This method returns class type
            // information about the runtime instance on which this method is executing. And from that, we can get the name of the class using
            // getSimpleName method.

            // this prints out the class which will be moving if we execute this method on a runtime object. But when we implement the subclasses
            // and run this method, the runtime object could be an instance of one of those classes, the adventure class, for example.
            System.out.println(title+ " is a "+ instanceType+ " film");
    }

    public static Movie getMovie(String type, String title){

        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };

        // What are we really doing here with the switch expression? We´re taking whatever was passed to us, making it uppercase, then just
        // getting the first letter. In our case, each of our subclasses has a unique letter for its class name, so we can use that, to figure out
        // the right kind of movie to create. And just for now, we´re returning a generic movie instance. The watchMovie() method of Movie only
        // prints the title and type of instance, but the overloaded methods of the subclasses do more.

        // Here, our switch expression is really evaluating a char, a single character. We get this character from the String method, charAt()
        // that we´re using in the Switch expression, and that´s going to give us the first letter of the type. And if that´s an A, we´ll return
        // a new Adventure instance, if it´s C, we´ll return a Comedy. Lastly, if it´s an S, that means we want to create a new Science fiction
        // movie. If it´s none of the options, we´ll just return the base class, an instance of movie.

        // By providing this method, the code in the main method(the calling code), doesn´t really need to know anything about any of Movie´s
        // subclasses. It can just pass in th type, and get a different type of Movie subclass.

        // This kind of method, that returns a new instance object, is known as a factory method in software programming design patterns.
        //Factory methods give us a way to get an object, without having to know the details of how to create a new one, or specify the exact
        // class we want.
    }

    
}



class Adventure extends Movie{

    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                                "Pleasant Scene",
                                "Scary Music",
                                "Something Bad Happens");
    // Let´s talk about this code, because here we´re using format specifiers %s and %n
    // %s is used to replace any String, which is not as commonly used as others as we shown you, but it will work well here.
    // And we´ve set before that %n puts a new like there. Now, this string gets repeated three times with this repeat method before the
    // formatting takes place. This means that all these stage plots get printed each on its own line.
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure!");
    }


}


class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                                "Something funny happens",
                                "Something even funnier happens",
                                "Happy Ending");
    
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy!");
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                                "Bad Aliens do Bad Stuff",
                                "Space Guys chase Aliens",
                                "Plane Blows Up");
    
    }

    public void watchScienceFiction(){
        System.out.println("Watching a Science Fiction Thriller!");
    }
}
