package za.ac.cput.inheritance.bad;

/**
 *
 * @author Zac Blazic
 */

public class SmartMobilePhone extends MobilePhone
{
    private int callCount;
    
    /* 
     * This method has a dependency on the implementation details of
     * its superclass. It assumes that the makeCall method invokes dial
     * automatically.
     */
    
    @Override
    public void makeCall(String number)
    {
        callCount++;
        super.makeCall(number);
    }
    
    public int getCallCount()
    {
        return callCount;
    }
}
