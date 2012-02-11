package za.ac.cput.searcher;

import java.util.List;

/**
 *
 * @author Zac Blazic
 */

public interface Searcher 
{
    List<String> search(String pattern);
}
