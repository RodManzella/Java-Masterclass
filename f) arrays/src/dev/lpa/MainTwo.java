package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class MainTwo {

    public static void main(String[] args) {
        
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);  // sorting the first array
        System.out.println(Arrays.toString(firstArray));

        int [] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);  // sets every element to five
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);  //alterar cópia não altera o original.
        System.out.println(Arrays.toString(fourthArray));

        System.out.println();
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));    // still original
        System.out.println(Arrays.toString(fourthArray));  // is sorted

        int [] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));  // gives us the first 5 elements of the third array in a new instance

        int [] largerArray =  Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));
        // the 10 elements of the thirdArray get copied to the largerArray, but it fills the spaces needed with default values(0 in this case)
        
    }

    private static int [] getRandomArray(int len){

         Random random = new Random();
         int [] newInt = new int[len];

         for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);  //returns random number between 0 and 99
         }

         return newInt;
    }
    
}
