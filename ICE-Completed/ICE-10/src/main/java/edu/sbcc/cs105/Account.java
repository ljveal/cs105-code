package edu.sbcc.cs105;

/**
 * Account
 */
public class Account {

    private String accountNumber;
    private double balance;
    
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void credit(double amount) throws Exception
    {


        System.out.println("In Account");

        if (amount < .01){
            throw new Exception("Credit amount must be at least $0.01");
        }

        balance += amount;
    }

    public void debit(double amount) throws Exception {

        System.out.println("In Account");
        
        if (amount > -.01){
            throw new Exception("Debit amount must be at least $0.01");
        }

        if (balance - amount < 0){
            throw new Exception("Balance cannot be less than zero");
        }
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }


    
}