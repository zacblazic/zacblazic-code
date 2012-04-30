package za.ac.cput.pattern.creational.builder;

/**
 *
 * @author 210208880
 */

public class MealOrder {
    
    private String drink;
    private String burger;
    private String chips;
    private String icecream;
    private String toy;

    public String getBurger() {
        return burger;
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    public String getIcecream() {
        return icecream;
    }

    public String getToy() {
        return toy;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setIcecream(String icecream) {
        this.icecream = icecream;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }
}
