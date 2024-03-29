package stringFormatting;

public class Main{

    public static void main(String[] args) {
        
        String bulletIt = "Print a Bulleted List:\n" +
        "\t\u2022 First Point \n" +
        "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);



        String textBlock = """
                Print a Bulleted List:
                            \u2022 First point
                                \u2022 Sub Point """;
        System.out.println(textBlock);

        // The text block makes outputting many lines of text, using indents and new lines a lot easier.
        // We´ve looked at formatting many lines of text in two different ways.

        // Let´s look at formatting numbers in text.




        int age = 35;
        System.out.printf("Your age is % d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year =  %d", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for(int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        // The String class itself has two methods, to support this type of formatting as well. One is a static method called format

        String formattedString = String.format("Your age is %d", age);
        //Here, we,re creating a String variable, and assigning it the output of the call to String.format, a static method.
        // Like System.out.printf, this method has a String as its first argument, followed by arguments that match the specifiers
        // in the String.
        System.out.println(formattedString);


        formattedString = "Your age is %d". formatted(age);
        System.out.println(formattedString);

        //When you use this method, you just pass the arguments that match the specifiers in the current String, and the result is a formatted
        // String.

    }

    //         \t        insert a tab character.
    //         \n        insert a new line character.
    //         \"        insert a double quote character.
    //         \\        insert a backlash character.

    /* Format specidifers:
        
        At their most complex, format specifiers take the form shown here.

        %[argument_index$] [flags] [width] [.precision] conversion

        They start with a percent sign, and end with a conversion symbol, and have lots of options in between.

        We´ve looked at one conversion type, d, which is the symbol used for a decimal integer value.

        f formats decimal numbers


     */
}