package week1.week9;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;

    // Constructor using super
    public CurrentAccount(int accountNumber, String accountHolderName,
                          double balance, double overdraftLimit)
    {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Withdraw with overdraft support
    public void withdraw(double amount)
    {
        if (balance + overdraftLimit >= amount)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Overdraft limit exceeded");
        }
    }

    public void displayCurrentAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

}