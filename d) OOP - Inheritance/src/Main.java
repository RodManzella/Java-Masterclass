public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");  //Setting the atribute make(String) to "Porsche of the instance car".
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Red");
        // car.model =  "Carrera";  // Can´t acess these fields because they are private.
        // car.color = "Red";
         System.out.println("make = "+ car.getMake());
         System.out.println("model = "+car.getModel());  //How do we get acess to those private fields?

        //What we´re going to do is allow acess to this data, either to set it, or get it through methods on this class.
        // These are a special set of methods, called getters, and setters. So, what are getters and setters?(see txt)

        car.describeCar();
    }
}
