package methods;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("New score is "+ calculateScore("Tim", 500));
        System.out.println("New score is "+calculateScore(10));
    }
    
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored "+score+ " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        
        return calculateScore("Anonymous", score);
        //Se uma pessoa não quiser passar o nome do jogador, esta função chama a outra passando um nome padrão como String.
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    // public static void calculateScore(){
    //     System.out.println("No player name, no player score.");  just changing the return type, won´t actually change the overall signature
       
    // }

    // We do need to change the number (or type) of parameters to make it unique.

    /*How can we use overloaded methods to suport what looks like default values for method parameters:
     * Looking at the two methods we set up parameters for, consider the scenario where maybe, we´ve made the 
     * player name optional and if the user doesn´t want to provide it, We´ll just default player name to "Anonymous".
     * As stated previously, other languages let you define default values for parameters, and this could be done in the
     * method definition. But not so with Java, at least, we can do the following:
     * 
     * We can change the method that has one parameter, to set up a value for a player name, and then execute the calculateScore
     * that takes playerName, as its first argument
     * 
     * SO, overloaded methods offer some of the same functionality that you can get from default values for parameters, in other languages.
     */
}
