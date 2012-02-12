package za.ac.cput.urlshortener.conf;

import com.google.inject.AbstractModule;
import za.ac.cput.urlshortener.URLShortener;
import za.ac.cput.urlshortener.internal.GoogleURLShortener;

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
