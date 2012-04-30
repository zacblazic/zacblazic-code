package za.ac.cput.pattern.structural.composite;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Revar
 */

public class CompositeJUnitTest {

    public CompositeJUnitTest() {
    }

    @Test
    public void testComposite() {
        Leaf leaf1 = new Leaf("A");
        Leaf leaf2 = new Leaf("B");
        Leaf leaf3 = new Leaf("C");
        Leaf leaf4 = new Leaf("D");
        Leaf leaf5 = new Leaf("E");
        
        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);
        
        Composite composite2 = new Composite();
        composite2.add(leaf3);
        composite2.add(leaf4);
        
        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(leaf5);
        
        System.out.println("Calling sayHello on leaf1");
        leaf1.sayHello();
        
        System.out.println("Calling sayHello on composite1");
        composite1.sayHello();
        
        System.out.println("Calling sayHello on composite2");
        composite2.sayHello();
        
        System.out.println("Calling sayGoodbye on composite3");
        composite3.sayGoodbye();
    }
}