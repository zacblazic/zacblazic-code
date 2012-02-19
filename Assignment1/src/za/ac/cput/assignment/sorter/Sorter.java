package za.ac.cput.assignment.sorter;

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
