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
    }

    public static void printInformation(String string){

        System.out.println("String = "+ string);
        System.out.println("length = "+string.length());
    }

    public static void printInformation(StringBuilder builder){

        System.out.println("String = "+ builder);
        System.out.println("length = "+builder.length());
    }
    
}
