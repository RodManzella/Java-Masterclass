package SwitchStatement;

public class NumberInWord {
    // Write a method called print NumberInWord. The method has one paramether which is the whole number. The method needs to print "ZERO"
    // "ONE", "TWO", ... "NINE", "OTHER" if the int parameter.

    // I will use the enhanced switch expression.

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(1000);

    }

    public static void printNumberInWord(int number){
        String numberEnglish = switch(number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(numberEnglish);
    }
    
}
