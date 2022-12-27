package compositiomChallenge;

public class CoffeeMaker {
    
    private boolean hasWorkToDo;

    public CoffeeMaker() {
        
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing coffee!");
        }
    }



    

    

}
