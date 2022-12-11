package sectionChallengesTwo;

public class AreaCalculator {
    public static void main(String[] args) {
        
    }

    public static double area (double radius){
        double returnValue;

        if(radius < 0){
            returnValue = -1;
        }
        else{
            returnValue = Math.PI * radius * radius;
        }
        return returnValue;

    }

    public static double area (double x, double y){
        return x * y;
    }
}
