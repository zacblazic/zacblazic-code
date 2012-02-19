
package za.ac.cput.assignment.account;

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
