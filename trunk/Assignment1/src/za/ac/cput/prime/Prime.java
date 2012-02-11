package za.ac.cput.prime;

/**
 *
 * @author Zac Blazic
 */

public class Prime 
{
    public static boolean isPrime(int number)
    {
        if(number <= 1)
        {
            return false;
        }
        
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static int[] generatePrimes(int amount, int offset)
    {
        int[] primes = new int[amount];
        int number = offset;
        int count = 0;

        while(count < amount)
        {
            if(Prime.isPrime(number))
            {
               primes[count++] = number;
            }
            
            number++;
        }
        
        return primes;
    }
}
