package za.ac.cput.assignment.oo.composition.model;

/**
 *
 * @author Zac Blazic
 */

public class CreditCard
{
    private final Card card;
    private final Date expiryDate;
    private final String ccvNumber;
    
    public CreditCard(String number, Date expiry, String ccvNumber)
    {
        this.card = new Card(number);
        this.expiryDate = expiry;
        this.ccvNumber  = ccvNumber;
    }
    
    public String getNumber()
    {
        return card.getNumber();
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
        return card.toString();
    }
}
