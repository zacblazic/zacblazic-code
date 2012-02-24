package za.ac.cput.assignment.oo.composition.model;

import java.math.BigDecimal;

/**
 *
 * @author Zac Blazic
 */

public class Invoice
{
    private final int invoiceNumber;
    private final Date paymentDate;
    private final BigDecimal invoiceTotal;
    
    public Invoice(int invoiceNumber, Date paymentDate, BigDecimal invoiceTotal)
    {
        this.invoiceNumber = invoiceNumber;
        this.paymentDate = paymentDate;
        this.invoiceTotal = invoiceTotal;
    }
    
    public int getInvoiceNumber()
    {
        return invoiceNumber;
    }
    
    public int getPaymentDay()
    {
        return paymentDate.getDay();
    }
    
    public int getPaymentMonth()
    {
        return paymentDate.getMonth();
    }
    
    public int getPaymentYear()
    {
        return paymentDate.getYear();
    }
    
    public BigDecimal getInvoiceTotal()
    {
        return invoiceTotal;
    }
    
    @Override
    public String toString()
    {
        return invoiceNumber + "";
    }
}
