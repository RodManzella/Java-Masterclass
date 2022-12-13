package userInput;

public class ReadingUserInput {
    public static void main(String[] args) {
        
        int currentYear = 2022;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

        
    //     String usersDateOfBirth = "1999";

    //     int dateOfBirth = Integer.parseInt(usersDateOfBirth);  //Parsing String userDateOfBirth to integer
    //     // We know that Integer is a class, it´s not an object. On this class, there is a static method called parseInt, that
    //     // takes a String and returns an Integer. And we just saw that, to acess static methods on a class, we have to use the Class
    //     // name and the dot notation with the name of the method, so, in other words, what we´re really doing is we´re calloing a method
    //     // on the class named Integer.
    //     System.out.println("Age = "+(currentYear - dateOfBirth));


    //     String usersAgeWithPartialYear =  "22.5";
    //     double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
    //     System.out.println("The user says he´s "+ ageWithPartialYear);
    // 

        
    
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi. what´s your name? ");  //IDE´S disable it, can only be executed from terminal.
        System.out.println("Hi "+ name +" Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are "+ age+ " years old";
        
    }

    public static String getInputFromScanner(int currenYear){
        return "";
    }
}
