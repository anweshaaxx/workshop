package week4.week8;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    // Atm.java
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount(123456789, "Anwesha", 5000);

        // Display initial account info
        account1.displayAccountInfo();
        System.out.println();

        // Deposit money
        account1.deposit(2000); // Deposit 2000
        System.out.println("Balance after deposit: " + account1.getBalance());
        System.out.println();

        // Withdraw money
        boolean success = account1.withdraw(3000); // Withdraw 3000
        System.out.println("Withdrawal success: " + success);
        System.out.println("Balance after withdrawal: " + account1.getBalance());
        System.out.println();

        // Attempt to withdraw more than balance
        account1.withdraw(5000);
        System.out.println("Final Balance: " + account1.getBalance());
    }
}

