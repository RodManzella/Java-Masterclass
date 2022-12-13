package userInput;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        
        int currentYear = 2022;

        try{
            System.out.println(getInputFromConsole(currentYear));  // No IntelliJ isso dá error (NullPointerException)
            //tentamos executar esse código
        }catch(NullPointerException e){  //ao executar aquele código, tivemos a exceção NullPointerException
            System.out.println(getInputFromScanner(currentYear));  //Para não finalizar o programa, executamos esse.
        }
        
        

        
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
        //Apparently vsCode allows it...
        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are "+ age+ " years old";
        
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scan = new Scanner(System.in); // we can parse primitive types and strings using methods from Scanner
        // The Scanner class has a method called nextLine(), but unlike System.console().readLine(), it doesn´t support
        // a prompt being passed in( readline() ). So, in this case, we need to split the prompt, from the reading of
        // The data, when using the Scanner.
        System.out.println("Hi, what is your name?");
        String name = scan.nextLine();  // scan is our local variable(named scan), that we can use to execute instance methods on.

        System.out.println("Hi, "+name+" , thanks for taking the course!");

        System.out.println("What year where you born?");


        boolean valiDOB = false;
        int age = 0;
        do{
            System.out.println("Enter a year of birth >= "+(currentYear - 125) +" and <= "+(currentYear));
            try{
                age = checkData(currentYear, scan.nextLine());
                valiDOB = age < 0 ? false: true;  
            }catch(NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! try again.");

            }
            scan.close();
            // The reason you create a variable in the parentheses of the catch keyword, is if you wanted to acess information about the
            // exception.

        } while(!valiDOB);  //!valiDOB == true
        // Se age < 0, o operador ternário joga false para valiDOB, esse valor é invertido pelo ! no while e o loop continua
        // Se age > 0, o operador ternário joga true para valiDOB, esse valor é invertido pelo ! no while e o loop termina(valor foi válido)



        

        return "So you are "+age+" years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minumumYear = currentYear - 125;

        if((dob < minumumYear) || (dob > currentYear)){
            return -1;  
        }
        return (currentYear - dob);
    }
}
