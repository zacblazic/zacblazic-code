package za.ac.cput.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Revar
 */

public class VisitorPatternJUnitTest {

    private static List<NumberElement> numberElements = new ArrayList<NumberElement>();
    SumVisitor sumVisitor = new SumVisitor();
    TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
    
    public VisitorPatternJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        TwoElement two1 = new TwoElement(3, 3);
        TwoElement two2 = new TwoElement(2, 7);
        ThreeElement three1 = new ThreeElement(3, 4, 5);
        
        numberElements.add(two1);
        numberElements.add(two2);
        numberElements.add(three1);
    }

    @Test
    public void testVisit() {
        System.out.println("Visiting element list with SumVisitor");
        sumVisitor.visit(numberElements);
        
        System.out.println("Visiting element list with TotalSumVisitor");
        totalSumVisitor.visit(numberElements);
        System.out.println("Total sum: " + totalSumVisitor.getTotalSum());
    }
}