package dev.lpa;

public class VarArgs {
    
    public static void main(String[] args) {

        // slit method splits a string into an array of Strings using a delimiter.

        String [] splitsStrings = "Hello World AGain".split(" ");

        printText(splitsStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));

        // Instead of having to overLoad this method to take an array of String, two Strings, or whatever, we have a single method declared.

        // there can be only one variable argument in a method.

        // The variable argument must be the last argument.


        

    
        
    }

    private static void printText(String ... textList){
        // podemos passar ou um array de Strings, ou uma String normal(O código roda do mesmo jeito)

        // the variable arguments parameter, gives us a lot more options, when we execute the method. Let´s look at these.

        // This feature lets us create one method, to support multiple ways, of calling this method.

        for(String t: textList){
            System.out.println(t);
        }
    }

    /*
         *   public static void main(String... args){
         * 
         *      // This is a special designation for Java, that means, Java will take zero, one, or many Strings, as arguments to this
         *      // method, and create an array with with which to process them, in the method.
         *   }
         * 
         * // The array will be called args, and be of type String.
         * // So what´s the difference then?
         * // The difference is minor, within the method body, but significant to the code that calls the method.
         */
}
