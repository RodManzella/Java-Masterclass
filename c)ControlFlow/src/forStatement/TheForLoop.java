package forStatement;

import javax.sound.sampled.SourceDataLine;

public class TheForLoop {
    public static void main(String[] args) {
        // for(int counter = 1; counter <= 5; counter++){
        //     System.out.println(counter);
        // }

        // for(double rate = 2.0; rate <= 5.0; rate ++){
        //     double interestAmount = calculateInterest(10000.0, rate);
        //     System.out.println("10,000 at "+ rate + "% interest = "+interestAmount);
        // }
        //The for loop above does the same thing as the prints below.

        // System.out.println("10,000 at 2% interest = "+ calculateInterest(10000.0, 2.0));
        // System.out.println("10,000 at 3% interest = "+ calculateInterest(10000.0, 3.0));
        // System.out.println("10,000 at 4% interest = "+ calculateInterest(10000.0, 4.0));
        // System.out.println("10,000 at 5% interest = "+ calculateInterest(10000.0, 5.0));

        // Mini challenge

        for(double i = 7.5; i <= 10; i += 0.25){
            double interestAmount = calculateInterest(100.00, i);
            System.out.println("10,000 at "+ i + "% interest = $"+interestAmount);
        }
        System.out.println("");

        // Next, let´s add one more requirement, so i can introduce you to another feature of looping.
        // Let´s say we only want to print the statement where the calculatedInterest is <= 8.5 dollars.
        // So, in other words, we want to loop through interest rates from 7.5 to 10, but exit out of the loop if the interest amount
        // ever gets to be more than 8.5 dollars.
        // one option is to use the break statement: The break statement transfers control out of an encloging statement. We´ve seen the break
        // statement in the switch statement, but it can also be used in a loop. A break statement is generally used in as in statement,
        // testing some condition on which to break out of the loop

        for(double i = 7.5; i <= 10; i += 0.25){
            double interestAmount = calculateInterest(100.00, i);
            if(interestAmount > 8.5){
                break;
            }
            System.out.println("10,000 at "+ i + "% interest = $"+interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));
    }
}
