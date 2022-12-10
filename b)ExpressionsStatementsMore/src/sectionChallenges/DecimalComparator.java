package sectionChallenges;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        
    }

    public static boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo){
       boolean returnValue;
        int value1 = (int)(valueOne * 1000);
        int value2 = (int)(valueTwo * 1000);

        if(value1 == value2){
            returnValue = true;
        }
        else{
            returnValue = false;
        }
        return returnValue;
        
    }
}
