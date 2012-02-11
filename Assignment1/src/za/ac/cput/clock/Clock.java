package za.ac.cput.clock;

/**
 *
 * @author Zac Blazic
 */

public interface Clock 
{
    void set(int hours, int minutes, int seconds);
    void add(int hours, int minutes, int seconds);
    void increment();
    int getHours();
    int getMinutes();
    int getSeconds();
    void reset();
}
