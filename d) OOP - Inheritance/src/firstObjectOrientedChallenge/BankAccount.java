package firstObjectOrientedChallenge;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String nameOfAccountHolder;
    private String emailOfAccountHolder;
    private String phoneOfAccountHolder;

    // From the constructor with no parameters, we´ll call the one with five parameters, and pass in literal values. So, to do that,
    // we type, this, followed by parentheses. Which constructor is called is determined by the values we pass. So we´ll add a call
    // to this in the no args constructor, and we´ll just pass some literals as arguments. The type and number of arguments we pass,
    // must match one of our constructors. Since we only have one other declared, and it only has five parameters, we´ll pass five
    // arguments. But the types must match the order of the types, that were declared in the constructor. So, all of our parameters
    // in the second constructor are strings, except the second parameter, which we called balance, and that´s a double
    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address",
        "Default phone");

        //What we´re doing here with the this, is a special use of this, which you won´t see used anywhere else.
        //This is calling another constructor within a constructor. So, what we´re saying ehre is, look, if you try and create an object
        // from this class, and you don´t give me any parameters, set this new object up with these values, by calling this other constructor.
        // Constructor chaining is optional, meaning it´s not something you have to do, but there can be situations where you want to do this.
        //  Now one other thing to keep in mind is, using this, to call another constructor, is that you have to be sure that it´s the very
        // first line that is being executed. In other words, we couldn´t have a Sysout as the first line in the constructor, because we would
        // get a compiler error. The call to this must be the fisrt statement in constructor´s body. So, the rules are pretty strict using the
        // this statement with parameters, can only be called in a constructor, and it has to be the very first line that´s called
        System.out.println("Empty constructor called.");
    }

    

    public BankAccount(String accountNumber, double accountBalance, String nameOfAccountHolder,
            String emailOfAccountHolder, String phoneOfAccountHolder) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.nameOfAccountHolder = nameOfAccountHolder;
        this.emailOfAccountHolder = emailOfAccountHolder;
        this.phoneOfAccountHolder = phoneOfAccountHolder;
    }



    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getNameOfAccountHolder() {
        return nameOfAccountHolder;
    }
    public void setNameOfAccountHolder(String nameOfAccountHolder) {
        this.nameOfAccountHolder = nameOfAccountHolder;
    }
    public String getEmailOfAccountHolder() {
        return emailOfAccountHolder;
    }
    public void setEmailOfAccountHolder(String emailOfAccountHolder) {
        this.emailOfAccountHolder = emailOfAccountHolder;
    }
    public String getPhoneOfAccountHolder() {
        return phoneOfAccountHolder;
    }
    public void setPhoneOfAccountHolder(String phoneOfAccountHolder) {
        this.phoneOfAccountHolder = phoneOfAccountHolder;
    }

    public void deposit(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of $"+depositAmount+" made. New balance is $"
        + accountBalance);
    }

    public void withdrawal(double withdrawalAmount){
        if(accountBalance - withdrawalAmount < 0){
            System.out.println("Insuficiente funds! You only have $"+accountBalance+
            " in your account" );
        }else{
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $"+withdrawalAmount +
            " processed, remaining balance = $"+accountBalance);
        }
    }

    
    
    
}

// Create a new class for a bank account.

// Create fields for account characteristics like:
    //account number
    //account balance
    //customer name
    //email
    //phone number

// Create getters and settes for each field.
// create two additional methods:
    //one for depositing funds into the account
    //one for withdrawing funds from the account

// A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative.
// You´ll create an instance of account class, and then test your withdrawal and deposit methods.
// You´ll print information to the console, that confirms what the balance is after the methods are called.