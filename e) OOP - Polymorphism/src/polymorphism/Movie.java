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
}
