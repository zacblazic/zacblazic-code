package za.ac.cput.pattern.behavioral.mediator;

/**
 *
 * @author Zac Blazic
 */

public class AmericanSeller {
    
    private Mediator mediator;
    private float price;
    
    public AmericanSeller(Mediator mediator, float price) {
        this.mediator = mediator;
        this.price = price;
        this.mediator.registerAmericanSeller(this);
    }
    
    public boolean isBidAccepted(float amount) {
        if(amount >= price) {
            System.out.println("Seller accepts the bid of " + amount + " dollars...");
            return true;
        } else {
            System.out.println("Seller rejects the bid of " + amount + " dollars...");
            return false;
        }
    }
}
