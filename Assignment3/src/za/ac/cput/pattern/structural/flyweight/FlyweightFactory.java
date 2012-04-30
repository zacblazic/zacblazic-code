package za.ac.cput.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Revar
 */

public class FlyweightFactory {

    private static FlyweightFactory instance;
    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
    
    private FlyweightFactory() {}
    
    public static FlyweightFactory getInstance() {
        if(instance == null) {
            instance = new FlyweightFactory();
        }
        
        return instance;
    }
    
    public Flyweight getFlyweight(String key) {
        if(flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight flyweight;
            
            if(key.equalsIgnoreCase("adder")) {
                flyweight = new FlyweightAdder();
            } else {
                flyweight = new FlyweightMultiplier();
            }
            
            flyweights.put(key, flyweight);
            
            return flyweight;
        }
    }
}