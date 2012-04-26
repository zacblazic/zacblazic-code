package za.ac.cput.pattern.behavioral.mediator;

/**
 *
 * @author Zac Blazic
 */

public class Buyer {
 
    protected Mediator mediator;
    private String currency;
    
    public Buyer(Mediator mediator, String currency) {
        this.mediator = mediator;
        this.currency = currency;
    }
    
    public boolean attemptPurchase(float amount) {
        System.out.println("Buyer attempting to purchase with a bid of " + 
                           amount + " " + currency + "...");
        return mediator.bid(amount, currency);
    }
}