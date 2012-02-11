package za.ac.cput.sorter;

/**
 *
 * @author Zac Blazic
 */

public interface Sorter 
{
    void insertArray(int[] array);
    int[] sortAscending();
    int[] sortDescending();
    void clear();
}
