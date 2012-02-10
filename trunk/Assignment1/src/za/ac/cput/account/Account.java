
package za.ac.cput.account;

/**
 *
 * @author Zac Blazic
 */
public interface Account 
{
    void withdraw(double amount);
    void deposit(double amount);
    double getBalance();
}
