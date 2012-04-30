package za.ac.cput.pattern.behavioral.visitor;

import java.util.List;

/**
 *
 * @author Zac Blazic
 */

public interface NumberVisitor {
    
    public void visit(TwoElement twoElement);
    public void visit(ThreeElement threeElement);
    public void visit(List<NumberElement> numberElements);
}