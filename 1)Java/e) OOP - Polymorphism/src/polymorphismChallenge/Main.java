package polymorphismChallenge;

public class Main {

    public static void main(String[] args) {
        
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 bLACK fERRARI sf90 Stradale",16, 8, 8);
        runRace(ferrariHybrid);

        // In this example, we created a polymorphic method on the Main class. This method only knew about the Car class, and not about any of its
        // subclasses. And it could be executed, for many different types as we showed.

        
    }

    public static void runRace(Car car){

        car.startEngine();
        car.drive();
    }
    
}
