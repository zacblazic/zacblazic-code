package za.ac.cput.assignment.sorter.internal;

import za.ac.cput.assignment.sorter.Sorter;

/**
 *
 * @author Zac Blazic
 */

public class BubbleSorter implements Sorter
{
    private int[] array = new int[0];
    
    @Override
    public void insertArray(int[] array) 
    {
        this.array = array;
    }

    @Override
    public int[] sortAscending() 
    {
        for(int i = 1; i < array.length; i++)
        {
            for(int j = 0; j < array.length - i; j++)
            {
                if(array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        return array;
    }

    @Override
    public int[] sortDescending() 
    {
        for(int i = 1; i < array.length; i++)
        {
            for(int j = 0; j < array.length - i; j++)
            {
                if(array[j] < array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        return array;
    }

    @Override
    public void clear() 
    {
        array = new int[0];
    }

}
