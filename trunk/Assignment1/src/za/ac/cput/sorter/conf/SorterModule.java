package za.ac.cput.sorter.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.sorter.Sorter;
import za.ac.cput.sorter.internal.SelectionSorter;

/**
 *
 * @author Zac Blazic
 */

public class SorterModule extends AbstractModule
{
    @Override
    protected void configure() 
    {
        bind(Sorter.class).to(SelectionSorter.class);
    }
}
