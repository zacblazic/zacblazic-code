package za.ac.cput.assignment.searcher.internal;

import java.util.ArrayList;
import java.util.List;
import za.ac.cput.assignment.searcher.Searcher;

/**
 *
 * @author Zac Blazic
 */

public final class PatternSearcher implements Searcher
{
    private final List<String> source;
    
    public PatternSearcher(List<String> source)
    {
        this.source = source;
    }
    
    @Override
    public List<String> search(String pattern) 
    {
        List<String> results = new ArrayList<String>();
        
        for(String s : source)
        {
            if(contains(s, pattern))
            {
                results.add(s);
            }
        }
        
        return results;
    }
    
    private boolean contains(String word, String pattern)
    {
        if(pattern.length() > word.length())
        {
            return false;
        }
        
        for(int i = 0; i <= word.length() - pattern.length(); i++)
        {
            if(pattern.equals(word.substring(i, i + pattern.length())))
            {
                return true;
            }
        }
        
        return false;
    }
}
