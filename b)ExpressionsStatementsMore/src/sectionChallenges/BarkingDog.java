package sectionChallenges;

public class BarkingDog {
    public static void main(String[] args) {
        
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean isAwake = false;

        if(hourOfDay < 0 || hourOfDay > 23){
            isAwake = false;
        }

        else if(barking){ 
            if(hourOfDay < 8 || hourOfDay > 22){  //Se chegou nessa condicional, não é menor que 0 e nem maior que 23
                isAwake = true;
            }
            else{
                isAwake = false;
            }
        }
        else{
            isAwake = false;
        }
        return isAwake;   
    }
}
