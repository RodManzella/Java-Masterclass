package allABoutStrings;

public class StringMethods {

    public static void main(String[] args) {
        
        // String birthdate = "25/11/1982";
        // int startingIndex = birthdate.indexOf("1982");
        // System.out.println("startingIndex = "+ startingIndex);
        // System.out.println("Birth year =  "+birthdate.substring(startingIndex));

        // System.out.println("Month = "+ birthdate.substring(3, 5));

        String newDate = String.join("/", "25" , "11", "1982");
        System.out.println("newDate = "+newDate);

        // newDate = "25";
        // newDate = newDate.concat("/");
        // newDate = newDate.concat("11");
        // newDate = newDate.concat("/");
        // newDate = newDate.concat("1982");
        // System.out.println("newDate = "+newDate);

        // newDate = "25" + "/" + "11" + "/" + "1982";
        // System.out.println("newDate = "+newDate);

         newDate = "25".concat("/").concat("11").concat("/")
                 .concat("1982");

        // this code style has a special name, and it´s called method chaining. You can write String methods this way because they return
        //Strings. But again, this is just like writing the concat statements, each on its own line. Each call to the concat method is still
        // a new String object being created, but instead of assigning that result to variable, we chain it to another method result.


        // Another very common String method is to replace a character or a part of the text, with some other character or String.
        //Let´s quickly look at the replace String varieties.

        System.out.println(newDate.replace('/', '-'));

        System.out.println(newDate.replace("2", "00"));

        // Let´s look at two more replace methods.

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        // You can see, the replaceFirst method just replaces the first instance, where there´s a match, so only the first forward slash was
        //replaced with a dash.

        // In contrast, the replaceAll method, replaced all ocurrences.

        // There´s another important difference between these two methods, and the replace method. The first argument for these last two
        // methods is really a regular expression String, which is a special syntax, that looks for patterns in a String. We´ll look at
        // regular expressions later in the course, but in general, you can use replaceFirst with basic Strings, to replace the first
        //instance. But if you want to replace all ocurrences of one String with another, use the replace method, rather than the replaceAll
        //method.

        




    }
}
