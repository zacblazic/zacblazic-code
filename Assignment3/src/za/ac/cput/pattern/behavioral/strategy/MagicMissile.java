package za.ac.cput.pattern.behavioral.strategy;

/**
 *
 * @author Zac Blazic
 */

public class MagicMissile implements Spell {

    public static final float DAMAGE_MODIFIER = 1.1f;
    
    
    @Override
    public void cast(float weaponDamage) {
        float spellDamage = weaponDamage + (weaponDamage * DAMAGE_MODIFIER);
        System.out.println("Magic missle caused: " + spellDamage + " damage.");
    }
}