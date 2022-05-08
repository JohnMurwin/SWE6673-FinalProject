package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesTest {

    @Test
    void getPrimeFactorization()
    {
        //Map<Long, Long> answer = new HashMap<Long, Long>(2,1);
        //assertEquals(answer, Primes.getPrimeFactorization(2));
    }

    @Test
    void isPrime()
    {
        assertEquals(false, Primes.isPrime(1));
        assertEquals(true, Primes.isPrime(2));
        assertEquals(true, Primes.isPrime(3));
        assertEquals(false, Primes.isPrime(4));
        assertEquals(true, Primes.isPrime(5));
        assertEquals(true, Primes.isPrime(7));
        assertEquals(false, Primes.isPrime(9));
        assertEquals(false, Primes.isPrime(10));
        assertEquals(true, Primes.isPrime(11));
        assertEquals(false, Primes.isPrime(50));
        assertEquals(true, Primes.isPrime(27644437));
    }

    @Test
    void sieveOfEratosthenes()
    {
        assertEquals(false, Primes.sieveOfEratosthenes(1));
        assertEquals(true, Primes.sieveOfEratosthenes(2));
        assertEquals(true, Primes.sieveOfEratosthenes(3));
        assertEquals(false, Primes.sieveOfEratosthenes(4));
        assertEquals(true, Primes.sieveOfEratosthenes(5));
        assertEquals(true, Primes.sieveOfEratosthenes(7));
        assertEquals(false, Primes.sieveOfEratosthenes(9));
        assertEquals(false, Primes.sieveOfEratosthenes(10));
        assertEquals(true, Primes.sieveOfEratosthenes(11));
        assertEquals(false, Primes.sieveOfEratosthenes(50));
        assertEquals(true, Primes.sieveOfEratosthenes(27644437));
    }

    @Test
    void millerRabinTest()
    {
        assertEquals(false, Primes.millerRabinTest(1));
        assertEquals(true, Primes.millerRabinTest(2));
        assertEquals(true, Primes.millerRabinTest(3));
        assertEquals(false, Primes.millerRabinTest(4));
        assertEquals(true, Primes.millerRabinTest(5));
        assertEquals(true, Primes.millerRabinTest(7));
        assertEquals(false, Primes.millerRabinTest(9));
        assertEquals(false, Primes.millerRabinTest(10));
        assertEquals(true, Primes.millerRabinTest(11));
        assertEquals(false, Primes.millerRabinTest(50));
        assertEquals(false, Primes.millerRabinTest(27644437));
    }
}