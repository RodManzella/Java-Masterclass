package sectionChallenges;

public class SpeedConverter {
    
    public static void main(String[] args) {
        long test = toMilesPerHour(1.5);
        System.out.println(test);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long valueReturned;

        if(kilometersPerHour < 0){
            valueReturned = - 1;
        }
        else{
            valueReturned = (long) (0.621371 * kilometersPerHour);
        }
        return valueReturned;
    }
}
