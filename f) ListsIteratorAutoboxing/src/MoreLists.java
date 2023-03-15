
import java.util.List;

public class MoreLists {
    
    public static void main(String[] args) {
        
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List <String> list = List.of(items);
        System.out.println(list);
        // This method transformed an array o string in a list of string

        System.out.println(list.getClass().getName());
        
    }
}
