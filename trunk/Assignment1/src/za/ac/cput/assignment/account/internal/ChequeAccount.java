
package za.ac.cput.assignment.account.internal;

import za.ac.cput.assignment.account.Account;

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
