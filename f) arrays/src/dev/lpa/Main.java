package dev.lpa;

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
        }
}

