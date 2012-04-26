package za.ac.cput.pattern.behavioral.template;

import org.junit.Test;

/**
 *
 * @author Zac Blazic
 */

public class ArenaJUnitTest {
    
    public ArenaJUnitTest() {
    }
    
    @Test
    public void testInitializeMatch() {
        Arena arena = new TwoPlayerArena();
        arena.initializeMatch();
    }
}