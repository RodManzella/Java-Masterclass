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
            double interestAmount = calculateInterest(10000.0, i);
            System.out.println("10,000 at "+ i + "% interest = "+interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));
    }
}
