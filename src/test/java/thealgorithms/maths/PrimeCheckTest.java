package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimeCheckTest {
    @Test
    void testIsPrime() {
        assertTrue(PrimeCheck.isPrime(7));
    }
}
