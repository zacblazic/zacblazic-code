package za.ac.cput.assignment.oo.inheritance.model;

/**
 *
 * @author Zac Blazic
 */

public class CreditCard extends Card
{
    private final Date expiryDate;
    private final String ccvNumber;
    
    public CreditCard(String number, Date expiry, String ccvNumber)
    {
        super(number);
        this.expiryDate = expiry;
        this.ccvNumber  = ccvNumber;
    }
    
    public int getExpiryMonth()
    {
        return expiryDate.getMonth();
    }
    
    public int getExpiryYear()
    {
        return expiryDate.getYear();
    }
    
    public String getCVV()
    {
        return ccvNumber;
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}
