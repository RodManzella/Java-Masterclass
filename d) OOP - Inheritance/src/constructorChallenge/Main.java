package constructorChallenge;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 1000, "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getLimit());
        System.out.println(customer.getEmail());


        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getLimit());
        System.out.println(secondCustomer.getEmail());


        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getLimit());
        System.out.println(thirdCustomer.getEmail());

        


    }
    
    
}
