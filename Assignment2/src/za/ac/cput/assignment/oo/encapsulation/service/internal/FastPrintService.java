package za.ac.cput.assignment.oo.encapsulation.service.internal;

import za.ac.cput.assignment.oo.encapsulation.model.Document;
import za.ac.cput.assignment.oo.encapsulation.service.PrintService;

/**
 *
 * @author Zac Blazic
 */

public class FastPrintService implements PrintService
{
    @Override
    public boolean print(Document document) 
    {
        if(document == null)
            return false;
        
        System.out.println("Printing " + document + " - " + document.getNumberPages() + " pages...");
        
        return true;
    }
}
