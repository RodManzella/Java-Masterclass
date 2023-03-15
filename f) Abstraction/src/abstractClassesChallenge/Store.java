package abstractClassesChallenge;

import java.util.ArrayList;

public class Store {
    
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        
        storeProducts.add("Oil painting", 1350, "Impressionistic work by ABF painted in 2010");
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
