package za.ac.cput.pattern.behavioral.visitor;

/**
 *
 * @author Revar
 */

public class ThreeElement implements NumberElement {
    
    private int a;
    private int b;
    private int c;
    
    public ThreeElement(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public void accept(NumberVisitor numberVisitor) {
        numberVisitor.visit(this);
    }
}