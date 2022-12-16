package firstObjectOrientedChallenge;

public class Main {
    public static void main(String[] args) {
        
        // BankAccount bobsAccount = new BankAccount("12345", 1000.00, "Bob Brown",
        //  "myemail@bob.com","(087) 123-4567");

        BankAccount bobsAccount = new BankAccount();

         //Just this statement does all the things below ^^^^

        // bobsAccount.setAccountNumber("12345");
        // bobsAccount.setAccountBalance(1000.00);
        // bobsAccount.setNameOfAccountHolder("Bob Brown");
        // bobsAccount.setEmailOfAccountHolder("myemail@bob.com");
        // bobsAccount.setPhoneOfAccountHolder("(087) 123-4567");

        

        bobsAccount.withdrawal(100);
        bobsAccount.deposit(250);
        bobsAccount.withdrawal(50);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com",
         "12345");

         
    }
    
}
