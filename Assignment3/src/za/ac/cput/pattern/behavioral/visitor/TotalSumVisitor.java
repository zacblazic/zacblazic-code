package za.ac.cput.pattern.behavioral.visitor;

import java.util.List;

/**
 *
 * @author Zac Blazic
 */

public class TotalSumVisitor implements NumberVisitor {
    
    private int totalSum = 0;
    
    @Override
    public void visit(TwoElement twoElement) {
        int sum = twoElement.getA() + twoElement.getB();
        totalSum += twoElement.getA() + twoElement.getB();
        System.out.println(twoElement.getA() + " + " + twoElement.getB() + " = " + sum);
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.getA() + threeElement.getB() + threeElement.getC();
        totalSum += threeElement.getA() + threeElement.getB() + threeElement.getC();
        System.out.println(threeElement.getA() + " + " + threeElement.getB() + " + " + threeElement.getC() + " = " + sum);
    }

    @Override
    public void visit(List<NumberElement> numberElements) {
        for(NumberElement numberElement : numberElements) {
            numberElement.accept(this);
        }
    }
    
    public int getTotalSum() {
        return totalSum;
    }
}