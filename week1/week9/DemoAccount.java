package week1.week9;


/**
 * Write a description of class DemoAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoAccount
{
    public static void main(String[] args)
    {
        SavingsAccount sa =
            new SavingsAccount(101, "Anwesha", 20000, 5);
        sa.deposit(3000);
        sa.displaySavingsAccount();

        System.out.println();

        CurrentAccount ca =
            new CurrentAccount(201, "Ramesh", 10000, 5000);
        ca.withdraw(13000);
        ca.displayCurrentAccount();
    }
}