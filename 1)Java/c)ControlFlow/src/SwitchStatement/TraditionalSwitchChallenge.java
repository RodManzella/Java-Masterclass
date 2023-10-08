package SwitchStatement;

public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        // create a new char variable.
        // Use the traditional switch statement (with a colon in case labels) that tests the value in  the variable from step 1.
        // - Create cases for the characters A, B, C, D and E
        // Display a message in each case block, with the letter and the NATO word, then break.
        // Add a default block, which displays the letter with a message saying not found.

        char natoWord = 'A';
       
        switch(natoWord){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not found");
                break;
                
        }
    }

    
}
