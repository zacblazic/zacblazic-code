package za.ac.cput.assignment.oo.inheritance.model;

/**
 *
 * @author Zac Blazic
 */

public class Card
{
    private final String number;
    
    public Card(String number)
    {
        this.number = number;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    @Override
    public String toString()
    {
        return number;
    }
}
