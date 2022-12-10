public class Main{

    public static void main (String[] args){

        //int int = 5;   int is a reserved keyword (can´t be a variable name)
        // int int2 = 5;   that is valid because it´s only part of the keyword.

        double kilometers = (100 * 1.6093344);

        int highScore = 50;

        if(highScore > 25){
            highScore = 1000 + highScore;
        }
        
        int health = 100;  //health = 100 is an expression (the data type and semicolon are not part of the expression)

        if ((health < 25)&& (highScore > 1000)){  // (health < 25)&& (highScore > 1000) is an expression
            highScore = highScore - 1000;  
        }
    }
}