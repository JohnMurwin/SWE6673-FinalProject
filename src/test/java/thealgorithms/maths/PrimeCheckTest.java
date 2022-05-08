package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeCheckTest {
    @Test
    void testIsPrime() {
        assertTrue(PrimeCheck.isPrime(7));
    }
}
