package sectionChallenges;

public class SpeedConverter {
    
    public static void main(String[] args) {
        double speedKm = 10;
        printConversion(speedKm);
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

    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        }
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +" km/h = "+milesPerHour+ "mi/h");
        }

    
    }
}
