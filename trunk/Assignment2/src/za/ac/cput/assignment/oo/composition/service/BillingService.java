package za.ac.cput.assignment.oo.composition.service;

import java.math.BigDecimal;
import za.ac.cput.assignment.oo.composition.model.CreditCard;
import za.ac.cput.assignment.oo.composition.model.Invoice;

/**
 *
 * @author Zac Blazic
 */

public interface BillingService
{
    Invoice bill(CreditCard card, BigDecimal amount);
}
