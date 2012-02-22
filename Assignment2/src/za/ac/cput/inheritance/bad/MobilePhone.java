package za.ac.cput.inheritance.bad;

import za.ac.cput.inheritance.Phone;

/**
 *
 * @author Zac Blazic
 */

public class MobilePhone implements Phone
{
    public MobilePhone()
    {
    }
    
    @Override
    public void dial(String number) 
    {
        System.out.println("Dialing: " + number + "...");
    }

    @Override
    public void makeCall(String number) 
    {
        dial(number);
        connectCall();
    }

    @Override
    public void endCall() 
    {
        System.out.println("Call disconnected.");
    }

    @Override
    public void answer() 
    {
        System.out.println("Call connected.");
    }

    @Override
    public void ring() 
    {
        System.out.println("Ring ring...");
    }
    
    private void connectCall()
    {
        System.out.println("Calling...");
        System.out.println("Call connected.");
    }
}
