package za.ac.cput.pattern.structural.facade;

/**
 *
 * @author Revar
 */

public class Facade {

    public int cube(int x) {
        Class1 class1 = new Class1();
        return class1.doSomethingComplicated(x);
    }
    
    public int cubeTimesTwo(int x) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        return class2.doAnotherThing(class1, x);
    }
    
    public int powerSixTimesTwo(int x) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        return class3.doMoreStuff(class1, class2, x);
    }
}