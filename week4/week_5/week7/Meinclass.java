package week4.week_5.week7;


/**
 * Write a description of class Meinclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Meinclass
{
    // Main class to test BankAccount
    public static void main(String[] args) {
        // Creating two bank accounts
        BankAccount customer1 = new BankAccount(101, "Alice", 5000);
        BankAccount customer2 = new BankAccount(102, "Bob", 10000);

        // Display initial info
        customer1.displayAccountInfo();
        customer2.displayAccountInfo();

        // Perform some operations
        customer1.deposit(2000);
        customer1.withdraw(1000);
        customer1.displayAccountInfo();

        customer2.withdraw(12000); // should show insufficient balance
        customer2.deposit(5000);
        customer2.displayAccountInfo();
    }
}

