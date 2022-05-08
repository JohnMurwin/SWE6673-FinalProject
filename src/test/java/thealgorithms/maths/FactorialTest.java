package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    void testFactorial() {
        assertEquals(40320.0, Factorial.factorial(8));
    }
}
