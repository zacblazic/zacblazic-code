package za.ac.cput.pattern.structural.composite;

/**
 *
 * @author Revar
 */

public class Leaf implements Component {
    
    private String name;

    public Leaf(String name) {
        this.name = name;
    }
    
    @Override
    public void sayHello() {
        System.out.println(name + " leaf says: Hello!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println(name + " leaf says: Goodbye!");
    }
}