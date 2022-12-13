package userInput;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    // in this challenge, you´ll read 5 valid numbers from the console, entered by the user, and print the sum of those
    // five numbers.
    // You´ll want to check that the numbers entered, are valid integers.
    // If not, print out the messae "Invalid number" to the console, but continue looping until you do have 5 valid numbers.
    // Before the user enters each number, prompt them with the message, "Enter number #x:", where x represents the count 1,2...
    // Use a Scanner object, and the nextLine method, to read input as a String.
    // Use Integer.parseInt
    // You´ll need some local variables, to keep track of the count of valid Integers, as weel as the sum of the integers.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter <= 5){
            System.out.println("Enter number #"+ counter+": ");
            String nextNumber = scan.nextLine();
            // para eu passar a string para int, deve ser um valor válido como inteiro
            try{
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            }catch(NumberFormatException nfe){
                System.out.println("Invalid number");
                // If the code in line 27 throws an exception, anything else in that try block is skipped
            }
        }
        System.out.println("The sum of the 5 numbers = "+ sum);
        scan.close();


    }
    
}
