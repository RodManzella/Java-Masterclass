package compositiomChallenge;

public class Main {
    public static void main(String[] args) {
        
        Refrigerator refrigerator = new Refrigerator();
        DishWasher dishWasher = new DishWasher();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartKitchen newKitchen = new SmartKitchen(refrigerator, dishWasher, coffeeMaker);

        newKitchen.pourMilk();
        newKitchen.addWater();
        newKitchen.loadDishWasher();

        newKitchen.getRefrigerator().orderFood();
        newKitchen.getDishWasher().doDishes();
        newKitchen.getCoffeeMaker().brewCoffee();


        
    }
}
