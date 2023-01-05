package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = "+ returnedMin);
    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String [] splits = input.split(",");
        int[] values = new int [splits.length];

        for(int i = 0; i < splits.length; i++){
            
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int [] array){

        int min = Integer.MAX_VALUE;

        for(int el: array){

            if(el < min){
                min = el;
            }
        }
        return min;
    }

    // Write a method called readIntegers, that reads a comma delimited list of numbers, entered by the user from the console, and then returns
    // an array, containing those numbers that were entered.

    // Next, write a method called findMin, that takes the array as an argument, and returns the minimum value found in that array.

    // In the main methhod, call the method readIntegers, to get the array of integers from the user, and print these out, suing a method found in
    // Java.util.Arrays.

    // call the find min method, returned from the call to the readIntegers method.

    // print the minimum element in the array, which should be returned from the findMin method.
    
}
