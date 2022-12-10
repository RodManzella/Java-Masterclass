package methods;

public class SecondsAndMinutesChallenge {

    // In this time, we´re going to create a method, that takes time represented in seconds and the parameter.
    // We´ll then want to transform the seconds into hours.
    // Next we´ll display the time in hours, with the remaining minutes and seconds, in a String.
    // We´ll do this transformation in two steps, which allows us to use overloaded methods.

    // We want to create two methods with the same name: getDurationString
    //The first method has one parameter of type int, named seconds.
    // The second method has two parameters, named minutes and seconds, both ints.
    // Both methods return a String in the format shown:
    //     XXh YYm ZZs´
    // Where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
    // the first method should in turn call the second method to return it´s results.
    // remember that one minute is 60 secons, and one hours equal 60 minutes, or 3600 seconds.

    // Add validation to the methods as a bonus:

    // For the first method, the seconds parameter should be >= 0.
    // For the second method, the minutes parameter should be >= 0, and the  seconds parameter should be >= 0, and <= 59.
    // If either value is passed an invalid value, print out some type of meaningful message to the user.

    public static void main(String[] args) {
        
    }

}
