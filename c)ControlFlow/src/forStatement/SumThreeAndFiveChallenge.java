package forStatement;

public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        //  create a for loop using a range of numbers from 1 to 1000.
        // Sum all the numbers that can be divided, by both 3 and 5.
        // Print out the numbers that have met the above conditions.
        // Break out of the loop once you have found 5 numbers that met the conditions above
        // after breaking out of the loop, print the sum of the numbers that met the conditions above.
        int acumulator = 0, counter = 0;

        for(int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            
            if(loopNumber % 15 == 0){
                acumulator += loopNumber;
                System.out.println("Found a match = "+loopNumber);
                counter++; 
            }

            if(counter == 5){
                break;
            }    
        }
        System.out.println("The sum of the five numbers that are both divisible by 3 and 5 is "+acumulator);
    }
    
}
