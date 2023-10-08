package encapsulation;

public class Main {

    public static void main(String[] args) {
        
        // Player player = new Player();
        // We didn´t create a constructor in the player class, but if you recall, a default constructor with no parameters gets created for us
        // by Java. In other words, we don´t now have a constructor to pass player data when we create a new player. This means the calling
        // code needs to manually set the data in these fields.

        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = "+ player.healRemaining());
        // player.health = 200;

        // player.loseHealth(11);
        // System.out.println("Remaining health = "+ player.healRemaining());

        // This code actually takes control away from the Player class, for managing the Player´s health. It didnpt call the restoreHealth 
        // method, which has the additional control in place, that player can never exceed 100.

        //Allowing direct acess to data on an object, can potentially bypass checks, and additional processing, your class has in place to manage
        // the data.
        // By being able to acess fields direcly like this, we´re really potentially opening up our application, to be acessed in ways that it
        // shouldn´t be. Maybe we don´t ever want to be able to change the ehalth like that, because we really wanted the restoreHealth method 
        // to be called, and the right set of conditions to be set. But because these fields are public to everyone, we can´t control when they get
        // accessed.


        // Allowing direct acess to fields, means calling code would need to change, when you edit any of the fields.

        // The third issue with this approach is, we´re manually initializing our object with these calls at start. This means the calling code
        // si responsible for making all the right method calls, to initialize a player, at the beginning of the play.
        // But the code might actually forget to initialize this all together. And consequently, when the class is called for he first time,
        // the player may be starting out with health = 0. In other words, we´re not guaranteeing or ensuring that, to acess the player class,
        // we can only acess it, when the data is valid.
        // We can do that with a constructror. We can actually make sure if the data is valid before the game starts.


        // Omitting a constructor, that would accept initialization data, may mean the calling code is responsible for setting up this data, on the new object.

        // We want the ability to ensure certain conditions are met before playing, and that acess to the player data during the game, is controlled
        // and protected.

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println(tim.healRemaining());
        
    }
    
}
