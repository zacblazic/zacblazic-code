package za.ac.cput.assignment.ocp.bad;

/**
 *
 * @author Zac Blazic
 */

public class CheckoutBiller
{
    private final String type;
    
    public CheckoutBiller(String type)
    {
        this.type = type;
    }
    
    public void bill(double amount)
    {
        //Add code to bill some credit card
        System.out.println("Billing R" + amount + "...");
    }
    
    public String getType()
    {
        return type;
    }
}
