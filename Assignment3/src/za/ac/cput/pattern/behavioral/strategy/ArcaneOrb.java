package za.ac.cput.pattern.behavioral.strategy;

/**
 *
 * @author Zac Blazic
 */

public class ArcaneOrb implements Spell {
    
    public static final float DAMAGE_MODIFIER = 1.75f;
    
    @Override
    public void cast(float weaponDamage) {
        float spellDamage = weaponDamage + (weaponDamage * DAMAGE_MODIFIER);
        System.out.println("Arcane orb caused: " + spellDamage + " damage.");
    }
}