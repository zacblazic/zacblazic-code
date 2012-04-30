package za.ac.cput.pattern.behavioral.visitor;

/**
 *
 * @author Zac Blazic
 */

public interface NumberElement {

    public void accept(NumberVisitor numberVisitor);
}