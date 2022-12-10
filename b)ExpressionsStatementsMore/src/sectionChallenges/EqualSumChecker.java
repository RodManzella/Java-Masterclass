package sectionChallenges;

public class EqualSumChecker {
    public static void main(String[] args) {
        
    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int sum){
        boolean returnedValue;
        int firstAndSecondSum = firstValue + secondValue;

        if(firstAndSecondSum == sum){
            returnedValue = true;
        }
        else{
            returnedValue = false;
        }
        return returnedValue;
    }
}
