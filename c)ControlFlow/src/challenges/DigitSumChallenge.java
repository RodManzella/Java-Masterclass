package challenges;

import javax.sound.sampled.SourceDataLine;

public class DigitSumChallenge {
    // In this challenge, your task is to write a method, with the name sumDigits, that has a single parameter
    // named number of type int, and it should return an int.

    // The method should only take a number that is a positive number.
    // If a negative number is passed, it should return -1, meaning an invalid value was passed.
    //The method should parse out each digit from the number, and sum the digits up.
    
    // So if 125 is the value passed to the method, the code should sum each digit, in this case, 1 + 2 + 5, and return int 8.

    // Use n % 10 to extract the least significant digit.
    // Use n / 10 to drop the last digit as you´re looping.
    public static void main(String[] args) {
        int sumOfEachDigit = digitSum(2002344);

        System.out.println(sumOfEachDigit);
    }

    public static int digitSum (int digit){
        int sum = 0;
        
        while(digit >= 1){
            int leastSignificantDigit = digit % 10;  //pega o número de menor valor decimal
            sum += leastSignificantDigit; // soma esse número ao acumulador sum
            digit = digit / 10;  // diminui a casa decimal do valor digit pra pegar o próximo número de menor valor decimal
        }
        return sum;
    }
}
