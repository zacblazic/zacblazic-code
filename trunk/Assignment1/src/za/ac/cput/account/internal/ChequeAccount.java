
package za.ac.cput.account.internal;

import za.ac.cput.account.Account;

/**
 *
 * @author Zac Blazic
 */
public class ChequeAccount implements Account
{
    private double balance;
    
    @Override
    public void withdraw(double amount) 
    {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) 
    {
        balance += amount;
    }

    @Override
    public double getBalance() 
    {
        return balance;
    }

}
