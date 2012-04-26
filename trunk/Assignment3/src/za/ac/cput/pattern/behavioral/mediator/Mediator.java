package za.ac.cput.pattern.behavioral.mediator;

/**
 *
 * @author Zac Blazic
 */

public class Mediator {
    
    private Buyer swedishBuyer;
    private Buyer frenchBuyer;
    private AmericanSeller americanSeller;
    private DollarConvertor dollarConvertor;
    
    public void registerSwedishBuyer(SwedishBuyer swedishBuyer) {
        this.swedishBuyer = swedishBuyer;
    }
    
    public void registerFrenchBuyer(FrenchBuyer frenchBuyer) {
        this.frenchBuyer = frenchBuyer;
    }
    
    public void registerAmericanSeller(AmericanSeller americanSeller) {
        this.americanSeller = americanSeller;
    }
    
    public void registerDollarConvertor(DollarConvertor dollarConvertor) {
        this.dollarConvertor = dollarConvertor;
    }
    
    public boolean bid(float amount, String currency) {
        float dollars = dollarConvertor.convert(amount, currency);
        return americanSeller.isBidAccepted(dollars);
    }
}