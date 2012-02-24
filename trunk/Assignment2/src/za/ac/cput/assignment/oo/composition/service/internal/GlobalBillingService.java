package za.ac.cput.assignment.oo.composition.service.internal;

import java.math.BigDecimal;
import za.ac.cput.assignment.oo.composition.model.CreditCard;
import za.ac.cput.assignment.oo.composition.model.Date;
import za.ac.cput.assignment.oo.composition.model.Invoice;
import za.ac.cput.assignment.oo.composition.service.BillingService;

/**
 *
 * @author Zac Blazic
 */

public class GlobalBillingService implements BillingService
{
    @Override
    public Invoice bill(CreditCard card, BigDecimal amount) 
    {   
        int invoiceNumber = 1;
        Date currentDate = new Date(24, 2, 2012);
        
        System.out.println("Billing " + card.getNumber() + " for " + amount);
        
        return new Invoice(invoiceNumber, currentDate, amount);
    }
}
