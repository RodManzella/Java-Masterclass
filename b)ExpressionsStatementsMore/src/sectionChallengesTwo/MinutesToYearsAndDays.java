package sectionChallengesTwo;

public class MinutesToYearsAndDays {
    // 1 day = 24h
    // 1 hour = 60 min
    // 1 day = 24h = 24 * 60 min = 1440 min
    // 1 year = 365 days * 1440 = 525.6000 min

    public static void main(String[] args) {
        printYearsAndDays(333673723);
    }

    public static void printYearsAndDays(long minutes){
        // 1 year = 525.000 min
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long years = minutes / 525000;
            long remainderMinutes =  minutes % 525000;

            long remainderMinutesToDays = remainderMinutes / 1440;

            System.out.println(minutes+ " min = "+years+" y and "+remainderMinutesToDays+" d");

        }

    }
}
