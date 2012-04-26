package za.ac.cput.pattern.behavioral.mediator;

/**
 *
 * @author Zac Blazic
 */

public class FrenchBuyer extends Buyer {
    
    public FrenchBuyer(Mediator mediator) {
        super(mediator, "euro");
        this.mediator.registerFrenchBuyer(this);
    }
}