package za.ac.cput.assignment.oo.inheritance.service;

import java.math.BigDecimal;
import za.ac.cput.assignment.oo.inheritance.model.CreditCard;
import za.ac.cput.assignment.oo.inheritance.model.Invoice;

/**
 *
 * @author Zac Blazic
 */

public interface BillingService
{
    Invoice bill(CreditCard card, BigDecimal amount);
}
