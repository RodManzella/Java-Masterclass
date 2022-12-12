package forStatement;

public class ForLoopChallenge {
    public static void main(String[] args) {
        
    }

    // public static boolean isPrime(int wholeNumber){

    //     if(wholeNumber <= 2){
    //         return(wholeNumber == 2);
    //     }

    //     for(int divisor = 2; divisor < wholeNumber; divisor ++){
    //         if(wholeNumber % divisor == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    //     // When you are using loops, it´s a good idea to see if there are any ways to cut down on iterations,
    //     // especially if the code block that´s being executed is complex, or creating a lot of variables.

    //     // One minor thing we could do, is change the code to iterate over less values.
    // }

    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <= 2){
            return(wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber; divisor ++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
        // We could use the halfway mark for a number, as the maximum value.
        // Let´s make those two minor changes, changing < to <=, and wholeNumber, to wholeNumber / 2.

        

        
    }
    
}
