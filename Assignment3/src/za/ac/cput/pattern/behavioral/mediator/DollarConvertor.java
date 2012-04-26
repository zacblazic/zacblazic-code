package za.ac.cput.pattern.behavioral.mediator;

/**
 *
 * @author Revar
 */
public class DollarConvertor {
    
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONA_UNIT = 8.0f;
    
    private Mediator mediator;
    
    public DollarConvertor(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.registerDollarConvertor(this);
    }
    
    public float convert(float amount, String currency) {
        if(currency.equalsIgnoreCase("euro")) {
            return convertKrona(amount);
        } else {
            return convertEuro(amount);
        }
    }

    private float convertKrona(float amount) {
        float dollars = amount * (DOLLAR_UNIT / KRONA_UNIT);
        System.out.println("Converting " + amount + " krona to " + dollars + " dollars...");
        
        return dollars;
    }

    private float convertEuro(float amount) {
        float dollars = amount * (DOLLAR_UNIT / EURO_UNIT);
        System.out.println("Converting " + amount + " euro to " + dollars + " dollars...");
       
        return dollars;
    }
}