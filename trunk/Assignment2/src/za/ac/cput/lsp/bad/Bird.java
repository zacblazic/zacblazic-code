package za.ac.cput.lsp.bad;

/**
 *
 * @author Zac Blazic
 */

public class Bird
{
    private boolean flying;
    
    public void fly()
    {
        System.out.println("I believe I can fly...");
        flying = true;
    }
    
    public void setFlying(boolean flying)
    {
        this.flying = flying;
    }
    
    public boolean isFlying()
    {
        return flying;
    }
}
