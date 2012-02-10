
package za.ac.cput.account.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.account.Account;
import za.ac.cput.account.internal.ChequeAccount;

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
