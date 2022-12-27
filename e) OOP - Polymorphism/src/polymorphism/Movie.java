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
