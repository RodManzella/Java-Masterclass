package abstractClassesChallenge;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product){

}

public class Store {
    
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        
        storeProducts.add(new ArtObject("Oil painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemOrder(order1, 1, 2);
        addItemOrder(order1, 0, 1);
        printOrder(order1);
    }
    public static void listProducts(){

        for(var item: storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemOrder(ArrayList<OrderItem> order, int orderIndex, int qty){

        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder (ArrayList<OrderItem> order){

        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }

        System.out.printf("Sales Total = $%6.2f %n");
    }

    /*
     - In this challenge, you need to build an application, that can be a store front, for any imaginable item for sale
     - Instead of the Main class we usually create, create a Store class, with a main method
     - The store should:
        . Manage a list of products for sale, includying displaying the product details
        . Manage an order, which can just be a list of OrderItem objects
        . Have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt
    - create a ProductForSale class that should have at least three fields: a type, price and a description, and should have methods to:
        . get a sales Price, a concrete method which takes a quantity, and returns the quantity times the price
        . print a Priced Line item, a concrete method which takes a quantity, and should print an itemized line for an order, with
          quantity and line item price.
        . show details, an abstract method, which represents what might be displayed on a product page, product type,description, price, and so on.

    - Create an OrderItem type, that has at minimum 2 fields, quantity and product for sale.

    - You should create two or three classes that extend the ProductForSale class, that will be products in your store.


    


     */
}
