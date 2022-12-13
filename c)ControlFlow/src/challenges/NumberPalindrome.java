package challenges;

public class NumberPalindrome{
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(101);
        System.out.println(palindrome);
        
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        boolean isNumberPalindrome = false;

        while(number != 0){
            reverse = (reverse * 10) +  (number % 10);
            number = number / 10;
        }

        if(reverse == number){
            isNumberPalindrome = true;
        }
        return isNumberPalindrome;
        
    }
}