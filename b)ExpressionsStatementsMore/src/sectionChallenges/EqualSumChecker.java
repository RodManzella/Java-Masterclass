package sectionChallenges;

public class EqualSumChecker {
    public static void main(String[] args) {
        
    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int sum){
        boolean returnedValue = false;
        int firstAndSecondSum = firstValue + secondValue;

        if(firstAndSecondSum == sum){
            returnedValue = true;
        }
        return returnedValue;
    }
}
