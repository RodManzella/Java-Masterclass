package methods;

public class MethodOverloadingChallenge {

    // Create two methods with the same name: convertToCentimeters

    //The first method has one parameter of type int, which represents the entire height in inches. You´ll convert inches to centimeters
    //in this method and pass back the number of centimeters, as a double.

    //The second method has two parameters of type int, one to represent height in feet, and other to represent the remaining height in inches.
    //So if a person is 5 foot and 8 inches, the value is 5 for feet and 8 for inches would be passes to this method. This method will convert
    // feet and inches to just inches, then call the first, also returning the value as a double.

    // Both methods should return a real number or decimal value for total height in centimeters.
    // Call both methods, and print out the results.
    
    // The conversion formula from inches to centimeters is 1 inch = 2.54cm.

    //Also remember that 1 foot = 12 inches.
    public static void main(String[] args) {
        
    }

    public static double convertToCentimeters(int inches){

        double inchesToCentimeters = (inches * 2.54);
        return inchesToCentimeters;
    }

    // public static double convertToCentimeters(int feet, int inches){

    //     return convertToCentimeters((feet * 12) + inches);
    // }

    public static double convertToCentimeters(int feet, int inches){
        int feetToInches = (feet * 12);
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
        // The same as the method above, but more organized.
    }
}
