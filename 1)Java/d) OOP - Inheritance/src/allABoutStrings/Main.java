package allABoutStrings;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello world");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld =  "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));
        //The first method, indexOf, gave us the position of the first L in Hello World.
        // The second method, lastIndexOf, gave us the position of the last L, in Hello World.

        // We found the first L at position 2. If we wanted to start looking for the next L, we´d start looking after that, at index 3.
        // We can pass 3 as the second argument to the indexOf method.
        // And we can do something similar with the lastIndexOf method. We said the last L was at index 9, and since this method searches
        // forward for the character, and not backwars, we´ll use 8 as the second argument.

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        // both of these calls find the 2nd L in the String, using different methods.

        // The indexOf method found it looking forward, starting at index 3, and searching towards the end of the String.
        // The lastIndexOfMethod found it looking backwards, starting from infex 8, and searching towards thje beginning of the String.


        //---------------------------------String comparison Methods----------------------------------------------------------------------

        String HelloWorldLower = helloWorld.toLowerCase();

        if(helloWorld.equals(HelloWorldLower)){
            System.out.println("Values match exactly");
        }

        if(helloWorld.equalsIgnoreCase(HelloWorldLower)){
            System.out.println("Values match ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("String ends with world");
        }
        if(helloWorld.contains("World")){
            System.out.println("String contains world");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }

        // You might be wondering why Java has both the equals method, and the contentEquals method. The contentEquals method isn´t limited
        // to just comparing String objects. It can be used to compare a StringBuilder´s value, which the equals method doesn´t support.

    //-----------------------------------String Comparison Methods-----------------------------------------------------------------------------
    
    


    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
