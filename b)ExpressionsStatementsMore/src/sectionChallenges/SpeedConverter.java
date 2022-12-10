package sectionChallenges;

public class SpeedConverter {
    
    public static void main(String[] args) {
        long test = toMilesPerHour(75.144);
        System.out.println(test);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long valueReturned = 0;

        if(kilometersPerHour < 0){
            valueReturned = - 1;
        }
        else{
            long expression = ((long) (0.621371 * kilometersPerHour));
            valueReturned = Math.round(expression);
        }
        return valueReturned;
    }
}
