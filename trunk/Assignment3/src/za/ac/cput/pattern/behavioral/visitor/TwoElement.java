package za.ac.cput.pattern.behavioral.visitor;

/**
 *
 * @author Zac Blazic
 */

public class TwoElement implements NumberElement{

    private int a;
    private int b;
    
    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public void accept(NumberVisitor numberVisitor) {
        numberVisitor.visit(this);
    } 
}