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


        // Maybe you´re asking, when can you assign an object of one type, to a reference, with a different type?
        // Well, first of all, you can assign any object to a reference that is of type Object.

        // We´ll know create a comedy instance, but assign it to an Object reference


        // Object comedy = Movie.getMovie("C", "Airplane");
        // comedy.watchMovie();

        // Here, now we created a variable called comedy, but we´ve said its type is Object. And this code doesn´t compile, but not on the first line
        // where we´re doing the assignment, but on the second statement, Can you figure out why?
        // The compiler won´t use the method return type, to figure out what comedy really is, after you make this assignment.
        // It just assumes it´s an Object, and this variable only has acess to Object´s functionality. This is because, at any time in the code,
        // an instance of Object could be assigned to this variable. And the code has to work for whatever object gets assigned to this variable.
        // This means that when you try to call a Movie method, on this object reference, you´ll get an error. This is because the compiler can´t
        // locate that method, watchMovie, on the Object class.


        // Let´s add a method on each of the subclasses, and we´ll make each method unique to the class.(watchComedy....)

       

        // If we try to run watchComedy on that Object variable, we have the same problem that we had with watchMovie: It doesn´t see that
        // method watchComedy on the Object class, and it´s not going to compile. Now, you could assign every instance to an Object reference
        // like this, but you wouldn´t be able to do much with them, without casting them to other typed references. In other words, to run
        // watchMovie on comedy (which has the type of object, we need to cast it to a Movie). We´ll cast the object reference to a movie, and
        // then, we´ll execute watchMovie on that new reference variable.

        // Object comedy = Movie.getMovie("C", "Airplane");
        // Movie comedyMovie = (Movie) comedy;
        // comedyMovie.watchMovie();

        // What i want you to see by this is, that using references that are too generic, like Object, means you´ll be doing a lot of casting. But
        // even now, since we cast to a Movie, check out what happens, if i want to execute one of the methods we just added, watchComedy:

        // Object comedy = Movie.getMovie("C", "Airplane");
        // Movie comedyMovie = (Movie) comedy;
        // comedyMovie.watchComedy();

        // This doesn´t compile either. For the same reason we couldn´t execute watchMovie on an Object reference, we can´t run watchComedy on just
        // a Movie reference. The compiler will only look at the reference type, to determine if that method is on that type, and watchComedy, is
        // not on the Movie class. In this case, we´d need to actually cast to a more specific type, Comedy. Let´s do that.

        // Object comedy = Movie.getMovie("C", "Airplane");
        // Comedy comedyMovie = (Comedy) comedy;
        // comedyMovie.watchComedy();


        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        // this code compiles, but here is something new. We haven´t used this before, and you´re probably asking what this var word mean?
        // Well, var is a special contextual keyword in Java, that lets our code take advantage of Local Variable Type Inference.
        // By using var as the type, we´re telling Java to figure out the compile-time for us.

        // Since the Movie class was declared as the return type, of the static method getMovie, then Hava can infer, that the type of this
        // variable airplane should be a Movie. Now why didn´t it infer that it was a Comedy class? Nothing about the signature of the method
        // indicated that a Comedy instance might be returned, from the method. Only that a Movie would be.

        // Let´s try another example of using typ inference, this time by just assigning a new instance.

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        // In this case, the compiler ahd an easier job, to infer the type, because we´re simpy assigning a new instance of Comedy to this
        // variable, plane. But you can see know, that using this plane variable, we can execute methods, specific to Comedy, without compile
        // time erros. Local Variable Type Inference was introduced in Java 10.
        // One of the benefits is to help with the readability of the code, and to reduce boilerplate code.
        // It´s called Local Variable Type Inference for a reason because:
        //  - It can´t be used in field declarations on a class.
        //  - It can´t be used in method signatures, either as a parameter or return type.
        //  - It can´t be used without an assignment, because the type can´t be inferred in that case
        //  - It can´t be assigned a null literal, again because a type can´t be inferred in that case.


        
    }
    
}
