package stringOptions;

public class Main {

    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");

        // StringBuilder helloWorldBuilder = "Hello" + "World";
        // This second statement doesn´t compile. This is an important difference between the String and the StringBuilder class,
        // you can´t assign a String literal to a StringBuilder variable. We have to use one of the constructors, so let´s do that.

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        // Now, let´s examine what we mean, when we say that the StringBuilder´s text value is mutable, but the String´s isn´t

        // First, we´ll use the concat method on String, which is a lot like using the plus operator on String. The result is a new String
        // object, with the argument value concatenated to the existing text.

        // For StringBuilder, a similar method is called append, so we´ll use that.

        // String is still "Hello World", but StringBuilder is "Hello World and Goodbye", and it´s length has increased.


        // When we passed the String literal, "and Goodbye", to the concat method, this creared an Object in memory for that literal,
        // "and Goodbye". It also created the result of the concat method, the object, the String, that has the value, "Hello World and Goodbye".
        // But our code has a mistake in it, because we didn´t assign the result of the method, the concat method, to a variable. It´s important
        // to remember to assign the result of any String manipulation method you call on a String, to a variable. These methods don´t change the
        // internals of the existing String object. The String referenced by helloWorld variable never changed, instead, a new String was created
        // by the method call.
        

        // After the call to the append method, we still only have one StringBuilder object. The variable helloWorldBuilder is still referencing
        // the same object, but the valye of that object changed. This is important, because it means the character sequence in the StringBuilder
        //changed. And this time, we didn´t have to assign the result to another variable to acess the result.


        // Now, we´ll create two more StringBuilder instances. This time, we´ll make them both start with empty character sequences.

        StringBuilder emptyStart =  new StringBuilder();
        emptyStart.append("a".repeat(17));
        // for the first StringBuilder object, which has a capacity of 16, this is going to require  a request for a larger memory area,
        // to store the extra data. Let´s now run this.

        // First, look at the value in the StringBuilder objects, both contain a String of a´s, and both have a length of 17, as expected.
        // But in the first case, the capacity is now 34(when we started out with 16). The new allocation size is determined by the JVM.
        // In the second case, the capacity is still 32, because we didn´t require reallocation, since the appended string still fit in the
        // original capacity. What happens if we change our code in the first instance to something bigger than 34 characters?
        // Let´s change our first call to repeat, to create a String of 57 characters. Now, the output show that the capacity of the first
        // empty StringBuilder, is actually the same size, as the String we passed in, 57.
        // At this stage, it´s not important that you understand how the next capacity is determined. But is important to understand that the
        //capacity does need to adjust, as the text in your StringBuilder grows.

        // If you know you plan to house a large text value in your StringBuilder object, start out with a larger capacity.

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        // A stringBuilder is mutable, meaning it can shrinkn or grow, in size. By default, an empty StringBuilder starts with a capacity
        // of 16, meaning it can contain up to 16 characters, before it needs to request more memory. In the second example, we created a
        //  a StringBuilder with a starting capacity of 32, which means our sequence can grow up to 32 characters, without needing to request 
        // additional allocation. Every time a StringBuilder needs to increase capacity, the data stored in the original storage, needs to get
        // copied over to the larger storage area. Let´s see this in action.
        // Let´s append some text to our two empty StringBuilder objects.
    }

    public static void printInformation(String string){

        System.out.println("String = "+ string);
        System.out.println("length = "+string.length());
    }

    public static void printInformation(StringBuilder builder){

        System.out.println("String = "+ builder);
        System.out.println("length = "+builder.length());
        System.out.println("capacity = " +builder.capacity());
    }
    
}
