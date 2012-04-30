package za.ac.cput.pattern.structural.facade;

/**
 *
 * @author Revar
 */

public class Class3 {
    
    public int doMoreStuff(Class1 class1, Class2 class2, int x) {
        return class1.doSomethingComplicated(x) * class2.doAnotherThing(class1, x);
    }
}