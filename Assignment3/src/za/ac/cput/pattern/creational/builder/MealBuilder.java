/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.pattern.creational.builder;

/**
 *
 * @author 210208880
 */
public class MealBuilder {
    
    public static class Builder {
        
        private String burger;
        
        //Optional
        private String drink;
        private String chips;
        private String icecream;
        private String toy;
        
        public Builder(String burger) {
            this.burger = burger;
        }
        
        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }
        
        public Builder chips(String chips) {
            this.chips = chips;
            return this;
        }
        
        public Builder icecream(String icecream) {
            this.icecream = icecream;
            return this;
        }
        
        public Builder toy(String toy) {
            this.toy = toy;
            return this;
        }
        
        public MealOrder build() {
            return getMealOrder(this);
        }

        private MealOrder getMealOrder(Builder builder) {
            MealOrder order = new MealOrder();
            order.setBurger(builder.burger);
            order.setChips(builder.chips);
            order.setDrink(builder.drink);
            order.setIcecream(builder.icecream);
            order.setToy(builder.toy);
            
            return order;
        }
    }
}
