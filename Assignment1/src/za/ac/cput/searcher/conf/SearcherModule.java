package za.ac.cput.searcher.conf;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import za.ac.cput.searcher.Searcher;
import za.ac.cput.searcher.internal.PatternSearcher;

/**
 *
 * @author Zac Blazic
 */

public class SearcherModule extends AbstractModule
{
    @Override
    protected void configure() 
    {
        bind(Searcher.class).to(PatternSearcher.class);
    }
    
    @Provides
    public PatternSearcher provideSearcher() throws Exception
    {
        List<String> source = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader("./words.txt"));
        String line = in.readLine();
        
        while(line != null)
        {
            source.add(line);
            line = in.readLine();
        }
        
        in.close();
        
        PatternSearcher patternSearcher = new PatternSearcher(source);
        return patternSearcher;
    }
}
