package za.ac.cput.assignment.prime.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.assignment.prime.Prime;
import za.ac.cput.assignment.prime.Prime;

/**
 *
 * @author Zac Blazic
 */

public class PrimeJUnitTest 
{
    public PrimeJUnitTest() 
    {
    }
   
    @Test
    public void testIsPrime() 
    {
        Assert.assertTrue(Prime.isPrime(17));
        Assert.assertTrue(Prime.isPrime(101));
        Assert.assertTrue(Prime.isPrime(137));
        Assert.assertFalse(Prime.isPrime(1));
        Assert.assertFalse(Prime.isPrime(-5));
        Assert.assertFalse(Prime.isPrime(100));
    }
    
    @Test
    public void testGeneratePrimes()
    {
        Assert.assertArrayEquals(new int[] {3, 5, 7}, Prime.generatePrimes(3, 3));
        Assert.assertArrayEquals(new int[] {61, 67, 71, 73, 79}, Prime.generatePrimes(5, 60));
        Assert.assertArrayEquals(new int[] {773, 787, 797}, Prime.generatePrimes(3, 770));
    }
}
