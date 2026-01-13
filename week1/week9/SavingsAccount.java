package week1.week9;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
     private double interestRate;

    // Constructor using super
    public SavingsAccount(int accountNumber, String accountHolderName,
                          double balance, double interestRate)
    {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest
    public double calculateInterest()
    {
        return balance * interestRate / 100;
    }

    public void displaySavingsAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}