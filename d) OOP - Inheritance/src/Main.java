public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // car.make = "Porsche";
        // car.model =  "Carrera";
        // car.color = "Red";
         System.out.println("make = "+ car.getMake());
         System.out.println("model = "+car.getModel());  //How do we get acess to those private fields?

        //What we´re going to do is allow acess to this data, either to set it, or get it through methods on this class.
        // These are a special set of methods, called getters, and setters. So, what are getters and setters?(see txt)

        car.describeCar();
    }
}
