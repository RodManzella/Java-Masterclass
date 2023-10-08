package SwitchStatement;

public class SwitchExpressiomChallenge {
    // In this challenge, we´re going to use the enhanced switch expression.
    // We´re going to make the enhanced switch expression, by assigning it to a variable.

    // Create a method called printDayOfWeek, that takes an int parameter called day, but doesn´t return any values.

    // Use the enhanced switch statement, to return the name of the day, based on the parameter passed to switch statement, so that 0
    // will return "Sunday", 1 will return "Monday", and so on. Any number not between 0 and 6, shoud return "Invalid Day".
    // Use the enhanced switch statement as an expression, returning the result to a String named dayOfTheWeek.

    // Print both the day variable and the dayOfTheWeek variable.

    // In the main method, call this method for the values 0 through 7.
    // Bonus: Create a second method called printWeekDay, that uses an if then else statement, instead of a switch, to produce the same
    // output.
    public static void main(String[] args) {
        
    }

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> {yield "Sunday";}  //just an example(yield is implicit), only necessary if inside curly braces.
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";

        }; //we are assigning this switch statemement to a variable (;)
        System.out.println(dayOfWeek);
    }

    public static void printWeekDay(int day){
        String weekDay = "Invalid day";

        if(day == 0){
            weekDay = "Sunday";
        }
        else if(day == 1){
            weekDay = "Monday";
        }
        else if(day == 2){
            weekDay = "Tuesday";
        }
        else if(day == 3){
            weekDay = "Wednesday";
        }
        else if(day == 4){
            weekDay = "Thursday";
        }
        else if(day == 5){
            weekDay = "Friday";
        }
        else if(day == 6){
            weekDay = "Saturday";
        }
        System.out.println(weekDay);
    }
}
        
        
