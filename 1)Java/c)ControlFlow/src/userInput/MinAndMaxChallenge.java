package userInput;

import java.util.Scanner;

public class MinAndMaxChallenge {
    // You´´ll be using an endless loop which:
    //  - prompts the user the enter a number, or any character to quit.
    //  - Validates if the user-entered data really is a number, you can choose either an integer, or double validation method
    //  - if the user-entered data is not a number, quit the loop.
    //  - Keep track of the minimum number entered.
    //  - keep track of the maximum number entered.

    // If the user has previously entered a set of numbers(or even just one), display the minimum and the maximum number, which the user has
    // entered

    // So, you want to create a loop that continues to process, until the user enters non numeric data. You´ll prompt the user to enter a number
    // or type a character to quit each iteration. After the user enters some data, you´ll read the input as a String and test if it can be parsed
    // to a number.
    // You can decide if you want to solicit integers or decimal numbers from the user

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        
        double decimalNumber = 0;
        double minValue = 0, maxValue = 0;
        int loopCount = 0;
        do{
            System.out.println("Type a valid decimal number: ");
            String decimalString = scan.nextLine();
            try{
                decimalNumber = Double.parseDouble(decimalString);
                
                if(loopCount == 0){
                    minValue = decimalNumber;
                    maxValue = decimalNumber;
                }
                else{
                    if(decimalNumber <= minValue){
                        minValue = decimalNumber;
                    }
                    if(decimalNumber >= maxValue){
                        maxValue = decimalNumber;
                    } 
                }
                loopCount++;
                System.out.println("Minimum value = "+minValue);
                System.out.println("Max value = "+maxValue);
                
            }catch(NumberFormatException e){
                System.out.println("Invalid String value");
                break;
            }
            
        }while(decimalNumber != 0);
    }



    
}
