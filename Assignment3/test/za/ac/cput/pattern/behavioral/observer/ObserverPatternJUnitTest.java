package za.ac.cput.pattern.behavioral.observer;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Zac Blazic
 */

public class ObserverPatternJUnitTest {
    
    private static Entity skeleton;
    
    public ObserverPatternJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        skeleton = new Monster("Skeleton", new Location(0, 0));
        
        skeleton.addMovementObserver(new MovementObserver() {
            @Override
            public void update(Location location) {
                System.out.println("Monster moved to X: " + 
                                   location.getX() + " Y: " + 
                                   location.getY());
            }
        });
    }
    
    @Test
    public void testMoveEntity() {
        skeleton.move(5, 5);
        skeleton.move(7, 3);
        skeleton.move(1, 3);
    }
}