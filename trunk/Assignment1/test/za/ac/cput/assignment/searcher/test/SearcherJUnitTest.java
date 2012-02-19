package za.ac.cput.assignment.searcher.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import za.ac.cput.assignment.searcher.Searcher;
import za.ac.cput.assignment.searcher.Searcher;
import za.ac.cput.assignment.searcher.conf.SearcherModule;

/**
 *
 * @author Zac Blazic
 */

public class SearcherJUnitTest 
{
    private static Injector injector;
    
    public SearcherJUnitTest() 
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        injector = Guice.createInjector(new SearcherModule());
    }

    @Test(timeout=1000)
    public void testSearch()
    {
        Searcher searcher = injector.getInstance(Searcher.class);        
        List<String> results = searcher.search("a");
    }
}