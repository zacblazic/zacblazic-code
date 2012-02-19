
package za.ac.cput.assignment.account.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.assignment.account.Account;
import za.ac.cput.assignment.account.internal.ChequeAccount;

/**
 *
 * @author Zac Blazic
 */
public class AccountModule extends AbstractModule
{
    @Override
    protected void configure() 
    {
        bind(Account.class).to(ChequeAccount.class);
    }

}
