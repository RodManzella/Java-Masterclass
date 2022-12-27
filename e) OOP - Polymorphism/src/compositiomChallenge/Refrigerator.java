package compositiomChallenge;

public class Refrigerator {
    
    private boolean hasWorkToDo;

    public Refrigerator(){

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Food is being ordered from refrigerator!");
            hasWorkToDo = false;
        }
    }

    


    

}
