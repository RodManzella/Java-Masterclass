package compositiomChallenge;

public class Main {
    public static void main(String[] args) {
        
        

        SmartKitchen newKitchen = new SmartKitchen();

        // newKitchen.getRefrigerator().setHasWorkToDo(true);
        // newKitchen.getDishWasher().setHasWorkToDo(true);
        // newKitchen.getCoffeeMaker().setHasWorkToDo(true);

        // newKitchen.getRefrigerator().orderFood();
        // newKitchen.getDishWasher().doDishes();
        // newKitchen.getCoffeeMaker().brewCoffee();

        newKitchen.setKitchenState(true, false, true);
        newKitchen.doKitchenWork();



    }
}
