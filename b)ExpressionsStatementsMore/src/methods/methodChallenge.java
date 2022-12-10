package methods;

public class methodChallenge {
    // In this challenge, we´re going to create two methods:

    // The first method should be named displayHighScorePosition.
    // this method should have two parameters, one for player´s name, and one for a player´s position in a high score list.
    // This method should print a message like "Tim managed to get into position 2 on the high score list"

    // The second method shoud be named calculateHighScorePosition.
    //This method should have only one parameter, the player´s score.
    // This method should return a number between 1 and 4, based on the score values shown in this table:

    /*Score greater than or equal to 1000 (1) */
    /*Score greater than or equal to 500, but less than 1000 (2)
     * Score greather than or equal to 100 but less than 500 (3)
     * All Other scores (4)
     */

     // Finally, we´ll call both methods and display the results for the following scores: 1500, 1000, 500, 100 and 25

     public static void main(String[] args) {
        int highScorePositionT = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePositionT);

        int highScorePositionB = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePositionB);

        int highScorePositionP = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePositionP);

        int highScorePositionG = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePositionG);

        int highScorePositionJ = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePositionJ);


     }



    //  public static int calculateHighScorePosition(int score){
    //     if(score >= 1000){
    //         return 1;
    //         here, whe are testing if the playerScore is >= 1000, and if it is, we exit with a value of 1
    //         This means that for all other test cases that are left, this playerScore will be less than 1000
    //     }
    //     else if(score >= 500){  
    //         return 2;
    //     }
    //     else if(score >= 100){  //It´s already been determined by the condition above, that playerScore is less than 500.(if reached this condition)
    //         return 3;           
    //     }
    //     return 4;  // If the three first conditions end up being false, it drops down to here(else is unecessary).
          
    //  }
    
    //Better way (using only one return statement)

    public static int calculateHighScorePosition(int score){
        int position = 4; 

        if(score >= 1000){
            position = 1;
        }
        else if(score >= 500){  
            position =  2;
        }
        else if(score >= 100){  //It´s already been determined by the condition above, that playerScore is less than 500.(if reached this condition)
            position = 3;           
        }
        return position;  // Se não cair em nenhuma das condições, como o valor está setado em 4 anteriormente, retorna 4.
          
     }
     

     public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName +" managed to get position "+ playerPosition+ " on the high score list");
     }



    
}
