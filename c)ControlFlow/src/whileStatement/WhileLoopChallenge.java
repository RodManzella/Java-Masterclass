package whileStatement;

public class WhileLoopChallenge {

    // So step 1 is to create a method called evenNumber, that takes as a parameter of type int.
    // It´s purpose is to determine if the argument passed to the method is an even numver or not.
    // return true from the method, if it´s an even number, otherwise return false;
    // next, use a while loop to test a range of numbers from 5 up to and including 20, but printing out only even numbers,
    // determined by the call to the isEvenNumber method.
    public static void main(String[] args) {
        int i = 4;

        while(i <= 20){
            i++;
            if(!isEvenNumber(i)){  // when values are NOT even, continue(ignores next code and goes to loop again)
                continue;
            }
            System.out.println("Even number "+i);
            
        }
        
    }

    public static boolean isEvenNumber(int number){
        boolean isEven = false;

        if(number % 2 == 0){
            isEven = true;
        }
        return isEven;
    }
    
}
