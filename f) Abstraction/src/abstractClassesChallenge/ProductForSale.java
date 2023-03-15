package abstractClassesChallenge;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;
    // protected: The subclasses can acess and modify these directly.
    // We want this, because our overriden methods will need to acess some of the attributes.

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){

        System.out.printf("2d quantity at $%8.2f each, %-15s %-35s %n",
         quantity, price, type, description);
    }

    public abstract void showDetails();

    // This class is abstract because we don´t really know what kind of products we´re supporting yet,
    // but we know what operations we want regardless of the type of product.
    // And we know our Store will want to show the details of the product, and the product can customize that as needed.

    
}
