package week1.week9;


/**
 * Write a description of class mmainclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mmainclass
{
    public static void main(String[] args)
    {
        PermanentEmployee p = new PermanentEmployee(1, "Anwesha", 50000, 8000);
        System.out.println("Permanent Employee:");
        p.displayPermanentEmployee();

        System.out.println();

        ContractEmployee c = new ContractEmployee(2, "Ramesh", 1500, 20);
        System.out.println("Contract Employee:");
        c.displayContractEmployee();
    }
}