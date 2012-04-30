package za.ac.cput.pattern.behavioral.visitor;

import java.util.List;

/**
 *
 * @author Zac Blazic
 */

public class SumVisitor implements NumberVisitor {

    @Override
    public void visit(TwoElement twoElement) {
        int sum = twoElement.getA() + twoElement.getB();
        System.out.println(twoElement.getA() + " + " + twoElement.getB() + " = " + sum);
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.getA() + threeElement.getB() + threeElement.getC();
        System.out.println(threeElement.getA() + " + " + threeElement.getB() + " + " + threeElement.getC() + " = " + sum);
    }

    @Override
    public void visit(List<NumberElement> numberElements) {
        for(NumberElement numberElement : numberElements) {
            numberElement.accept(this);
        }
    }
}