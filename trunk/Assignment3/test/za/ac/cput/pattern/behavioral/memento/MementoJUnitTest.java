package za.ac.cput.pattern.behavioral.memento;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Revar
 */

public class MementoJUnitTest {

    private static DietInfoCaretaker dietInfoCaretaker;
    
    public MementoJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        dietInfoCaretaker = new DietInfoCaretaker();
    }

    @Test
    public void testMemento() {
        DietInfo dietInfo = new DietInfo("Zac", 1, 95);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumber(2);
        dietInfo.setWeight(94);
        System.out.println(dietInfo);
        
        System.out.println("Saving state...");
        dietInfoCaretaker.save(dietInfo);
        
        dietInfo.setDayNumber(3);
        dietInfo.setWeight(93);
        System.out.println(dietInfo);
        
        dietInfo.setDayNumber(4);
        dietInfo.setWeight(92);
        System.out.println(dietInfo);
        
        System.out.println("Restoring saved state...");
        dietInfoCaretaker.restore(dietInfo);
        System.out.println(dietInfo);
    }
}