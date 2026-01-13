package week1.week9;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
     protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    // Get balance
    public double getBalance()
    {
        return balance;
    }
}