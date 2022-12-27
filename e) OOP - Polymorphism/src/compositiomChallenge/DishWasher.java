package compositiomChallenge;

public class DishWasher {
    
    private boolean hasWorkToDo;

    public DishWasher(){

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishes are now being washed!");
            hasWorkToDo = false;
        }
    }
}
