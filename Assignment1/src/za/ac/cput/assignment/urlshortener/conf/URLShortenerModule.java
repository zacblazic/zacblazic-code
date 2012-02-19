package za.ac.cput.assignment.urlshortener.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.assignment.urlshortener.URLShortener;
import za.ac.cput.assignment.urlshortener.internal.GoogleURLShortener;

/**
 *
 * @author Zac Blazic
 */

public class URLShortenerModule extends AbstractModule
{
    @Override
    protected void configure() 
    {
        bind(URLShortener.class).to(GoogleURLShortener.class);
    }
}
