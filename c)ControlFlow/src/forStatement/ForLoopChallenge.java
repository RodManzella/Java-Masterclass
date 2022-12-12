package forStatement;

public class ForLoopChallenge {
    public static void main(String[] args) {
        determinePrimeInRange(1, 65);
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

        for(int divisor = 2; divisor <= wholeNumber / 2; divisor ++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
        // We could use the halfway mark for a number, as the maximum value.
        // Let´s make those two minor changes, changing < to <=, and wholeNumber, to wholeNumber / 2.
    }

    public static void determinePrimeInRange(int first, int last){

        int counter = 1;

        if(first > 1000 || last > 1000){
            System.out.println("Invalid range");
        }else{
            for(int i = first; i <= last; i++){
                if(isPrime(i)){
                    System.out.println("The number "+i+ " IS prime.");
                    counter++;
                }else{
                    System.out.println("The number "+i+ " IS NOT prime.");
                    counter++;
                }
                if(counter == 3){
                    System.out.println("Found 3 - exiting for loop");
                    break;
                }
                  
            } 
        }
    }


    
}
