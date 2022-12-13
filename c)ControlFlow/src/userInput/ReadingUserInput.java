package userInput;

public class ReadingUserInput {
    public static void main(String[] args) {
        
        int currentYear = 2022;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);  //Parsing String userDateOfBirth to integer
        // We know that Integer is a class, it´s not an object. On this class, there is a static method called parseInt, that
        // takes a String and returns an Integer. And we just saw that, to acess static methods on a class, we have to use the Class
        // name and the dot notation with the name of the method, so, in other words, what we´re really doing is we´re calloing a method
        // on the class named Integer.
        System.out.println("Age = "+(currentYear - dateOfBirth));


        String usersAgeWithPartialYear =  "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he´s "+ ageWithPartialYear);
    }
    
}
