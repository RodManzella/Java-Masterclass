package inheritanceVsComposition;

public class Main {

    public static void main(String[] args) {
        
        ComputerCase theCase = new ComputerCase("2208","dell", "240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27,"2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus" , 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        // thePC.getMonitor().drawPixelAt(10, 10, "red");
        // thePC.getMotherboard().loadProgram("Windows OS");
        // thePC.getComputerCase().pressPowerButton();

        // Here, in all three cases, we´re ultimately accessing functions in other classes, theCase, theMotherboard and the monitor, but
        // we´re  acessing them through thePC object.

        // We really don´t want the Main class, or any class except thePersonalComputer, to make calls on its parts.
        // Okay, so next, let´s create methods on PersonalComputer, which will expose to the calling code.

        thePC.powerUp();
        
    }

    

    
    
}
