package dev.lpa;

import java.util.Arrays;

public class Main {
    
        public static void main(String[] args) {
            
            int[] myIntArray = new int [10];
            // The size of an array, once created, is fixed.
            myIntArray[0] = 45;
            myIntArray[1] = 1;
            myIntArray[5] = 50;  // index go to 0 from 9
    
            double [] myDoubleArray = new double[10];
            myDoubleArray[2] = 3.5;
    
            System.out.println(myDoubleArray[2]);
    
    
            // Better way to initialize a smaller array:
    
            int [] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("First = " +firstTen[0]);
            int arrayLength = firstTen.length;
            System.out.println("Length of array = "+arrayLength);
            System.out.println("Last = "+firstTen[arrayLength - 1]);


            int [] newArray;
            // newArray = new int[]{5, 4, 3, 2, 1};
            newArray = new int [5];
            
            for(int i = 0; i < newArray.length; i++){
                newArray[i] = newArray.length - i;
            }

            for(int i = 0; i < newArray.length; i++){
                System.out.print(newArray[i]+ " ");
            }

            // enchanced for loop(the for each loop)

            System.out.println();

            for(int element: newArray){
                System.out.print(element + " ");
            }

            System.out.println();
            System.out.println(Arrays.toString(newArray));

            Object objectVariale = newArray;
            if(objectVariale instanceof int[]){
                System.out.println("objectVariable is really an int array");
            }

            Object [] objectArray = new Object[3];
            objectArray[0] = "Hello";
            objectArray [1] = new StringBuilder("World");  //not good practice
            objectArray [2] = newArray;  //nested array

        }
}

