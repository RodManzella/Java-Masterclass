package sectionChallengesTwo;

public class PlayingCat {
    public static void main(String[] args) {
        
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying;

        if(!summer){
            if(temperature >= 25 && temperature <= 35){
                isPlaying = true;
            }
            else{
                isPlaying = false;
            }
            
        }else{
            if(temperature >= 25 && temperature <= 45){
                isPlaying = true;
            }
            isPlaying = false;
        }
        return isPlaying;
    }
    
}
