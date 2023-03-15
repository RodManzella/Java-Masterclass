public class ArrayListExample {
    
    record GroceryItem(String name, String type, int count){

        public GroceryItem(String name){
            this(name, "DAIRY", 1);
        }
    }
    public static void main(String[] args) {
        
    }
}
