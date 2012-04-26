package za.ac.cput.pattern.behavioral.mediator;

/**
 *
 * @author Zac Blazic
 */

public class SwedishBuyer extends Buyer {
    
    public SwedishBuyer(Mediator mediator) {
        super(mediator, "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}
