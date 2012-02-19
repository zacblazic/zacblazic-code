package za.ac.cput.assignment.sorter.internal;

import za.ac.cput.assignment.sorter.Sorter;

/**
 *
 * @author Zac Blazic
 */

public class SelectionSorter implements Sorter
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
        for(int i = 0; i < array.length; i++)
        {
            int minIndex = i;
            
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[j] < array[minIndex])
                    minIndex = j;
            }
            
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        
        return array;
    }

    @Override
    public int[] sortDescending() 
    {
        for(int i = 0; i < array.length; i++)
        {
            int maxIndex = i;
            
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[j] > array[maxIndex])
                    maxIndex = j;
            }
            
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
        
        return array;
    }

    @Override
    public void clear() 
    {
        array = new int[0];
    }
}
