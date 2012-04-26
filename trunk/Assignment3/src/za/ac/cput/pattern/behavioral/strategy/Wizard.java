package za.ac.cput.pattern.behavioral.strategy;

/**
 *
 * @author Zac Blazic
 */

public class Wizard {
    
    private Spell currentSpell;
    private float weaponDamage;
    
    public Wizard(float weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
    
    public void setCurrentSpell(Spell currentSpell) {
        this.currentSpell = currentSpell;
    }
    
    public void castCurrentSpell() {
        if(currentSpell != null) {
            currentSpell.cast(weaponDamage);
        } else {
            System.out.println("No spell selected");
        }
    }
}