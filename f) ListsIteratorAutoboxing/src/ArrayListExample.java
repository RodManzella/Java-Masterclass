
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    
    record GroceryItem(String name, String type, int count){
        // works like a compact class(without boiler code).

        public GroceryItem(String name){
            this(name, "DAIRY", 1);
        }

        @Override
        public String toString(){
            return String.format("%d %s in %s", count, name.toUpperCase(), type);
        }
    }
    public static void main(String[] args) {
        
        // Object[] groceryArray = new Object [3];
        // groceryArray[0] = new GroceryItem("Milk");
        // groceryArray[1] = new GroceryItem("Milk", "PRODUCE", 6);
        // groceryArray[2] = "5 oranges";  // the compiler acceps it because we said the array is of objects
        // System.out.println(Arrays.toString(groceryArray));

        Object[] groceryArray = new Object [3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Milk", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 5);  // the compiler acceps it because we said the array is of objects
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();  // arraylist grows automatically when needed.
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));  
        // will replace index 0
        // groceryList.remove(1);
        System.out.println(groceryList);

        // if we don´t specify the type of the ArrayList, it will use the Object class by default.
    }
}
