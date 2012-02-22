package za.ac.cput.assignment.ocp.good;

/**
 *
 * @author Zac Blazic
 */

public class SuperCheckoutBiller implements Biller
{
    @Override
    public void bill(double amount)
    {
        System.out.println("Billing R" + amount + "...");
    }

    @Override
    public void initialize()
    {
        System.out.println("Initializing super checkout biller");
        //Add some code to set up the biller
    }
}
