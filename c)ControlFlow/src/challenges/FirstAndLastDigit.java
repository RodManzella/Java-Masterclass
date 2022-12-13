package challenges;

public class FirstAndLastDigit {
    // Write a method named sumFirstAndLastDigit of type int called number
    // The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum
    // of the first and last digit of that number.
    //If the number is negative, then the method should return - 1 to indicate a negative value

    public static void main(String[] args) {
        
    }

    public static int sumFirstAndLastDigit(int number){
        int leastSignificantDigit = number % 10;
        int mostSignificantDigit = 0;

        while(number > 1){
            number = number / 10;
            
            if(number <  1){
                mostSignificantDigit = number % 10;
            }
        }
        return leastSignificantDigit + mostSignificantDigit;
    }
    
}
