package whileStatement;

public class WhileLoopChallenge {

    // So step 1 is to create a method called evenNumber, that takes as a parameter of type int.
    // It´s purpose is to determine if the argument passed to the method is an even numver or not.
    // return true from the method, if it´s an even number, otherwise return false;
    // next, use a while loop to test a range of numbers from 5 up to and including 20, but printing out only even numbers,
    // determined by the call to the isEvenNumber method.

    // Step 2 is to modify the while code.
    // Make it also record the total number of even numbers it has found.
    // break out of the loop once 5 even numbers are found.
    // Finally, display the total number of odd and even numbers found.

    public static void main(String[] args) {
        int number = 4;
        int max = 20;
        int evenCounter = 0;
        int OddCount = 0;

        while(number <= max){
            number++;
            if(!isEvenNumber(number)){  // when values are NOT even, continue(ignores next code and goes to loop again)
                OddCount++;
                continue;
            }
            
            System.out.println("Even number "+number);
            evenCounter++;
            if(evenCounter <= 5){
                break;
            }
        }
        
        System.out.println("Total odd numbers = "+OddCount);
        System.out.println("Total even numbers = "+evenCounter);
        
    }

    public static boolean isEvenNumber(int number){
        boolean isEven = false;

        if(number % 2 == 0){
            isEven = true;
        }
        return isEven;
    }
    
}
