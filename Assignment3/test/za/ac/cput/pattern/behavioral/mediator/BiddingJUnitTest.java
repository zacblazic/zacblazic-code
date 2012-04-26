package za.ac.cput.pattern.behavioral.mediator;

import java.math.BigDecimal;
import org.junit.Test;

/**
 *
 * @author Zac Blazic
 */

public class BiddingJUnitTest {
    
    public BiddingJUnitTest() {
    }

    @Test
    public void testBidding() {
        Mediator mediator = new Mediator();
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        Buyer swedishBuyer = new SwedishBuyer(mediator);
        AmericanSeller americanSeller = new AmericanSeller(mediator, 100.0f);
        DollarConvertor dollarConvertor = new DollarConvertor(mediator);
        
        float swedishBid = 55.0f;
        while(!swedishBuyer.attemptPurchase(swedishBid)) {
            swedishBid += 15.0f;
        }
        
        float frenchBid = 3.0f;
        while(!frenchBuyer.attemptPurchase(frenchBid)) {
            frenchBid += 1.5f;
        }
    }
}