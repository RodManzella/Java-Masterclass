package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    
    public static void main(String[] args) {
        
    }

    public static int[] generateRandomIntArray(int length){

        Random random = new Random();

        int randomArray[] = new int[length];

        for(int i = 0; i < randomArray.length - 1; i++){
            randomArray [i] = random.nextInt(100);
        }
        return randomArray;
    }

    public static int[] sortIntegers(int [] array){
        
        int []sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
        
    }
}
