package firstObjectOrientedChallenge;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String nameOfAccountHolder;
    private String emailOfAccountHolder;
    private String phoneOfAccountHolder;

    public BankAccount(){
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