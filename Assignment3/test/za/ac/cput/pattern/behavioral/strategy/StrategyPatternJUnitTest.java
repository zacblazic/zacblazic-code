package za.ac.cput.pattern.behavioral.strategy;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Zac Blazic
 */

public class StrategyPatternJUnitTest {
    
    private static Wizard wizard;
    
    public StrategyPatternJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        wizard = new Wizard(20.0f);
    }
    
    @Test
    public void testNoSpell() {
        wizard.castCurrentSpell();
    }

    @Test
    public void testCastMagicMissile() {
        Spell magicMissile = new MagicMissile();
        wizard.setCurrentSpell(magicMissile);
        wizard.castCurrentSpell();
    }
    
    @Test
    public void testCastArcaneOrb() {
        wizard.setCurrentSpell(new ArcaneOrb());
        wizard.castCurrentSpell();
    }
}