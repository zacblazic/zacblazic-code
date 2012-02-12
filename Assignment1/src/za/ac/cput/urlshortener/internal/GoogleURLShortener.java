package za.ac.cput.urlshortener.internal;

import za.ac.cput.urlshortener.URLShortener;

/**
 *
 * @author Zac Blazic
 */

public class GoogleURLShortener implements URLShortener
{
    private final String domain = "goo.gl";
    private final int length = 5;
    private final int base = 62;
    private long uid;
    
    private final String[] characters = {"0", "1", "2", "3", "4", "5", "6",
    "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", 
    "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", 
    "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    
    public GoogleURLShortener()
    {
        /* 
         * The uid should start from base ^ (length - 1) in practice, but in 
         * this case we are generating a number between base ^ (length - 1) 
         * and base ^ (length - 1) * 30. This should give you at least half
         * of the coverage for the length.
         */
        long min = (long)Math.pow(base, length - 1);
        long max = (long)Math.pow(base, length - 1) * 30;
        uid = min + (long)(Math.random() * (max - min + 1));
    }
    
    @Override
    public String shorten(String url) 
    {
        String[] shortened = new String[length];
        long id = uid;
        int i = length - 1;
        
        while(id > 0)
        {
            shortened[i--] = characters[(int)(id % base)];
            id = id / base;
        }
        
        uid++;
        
        return domain + "/" + arrayToString(shortened);
    }
    
    private String arrayToString(String[] array)
    {
        StringBuilder s = new StringBuilder();
        
        for(int i = 0; i < array.length; i++)
        {
            s.append(array[i]);
        }
        
        return s.toString();
    }
}
