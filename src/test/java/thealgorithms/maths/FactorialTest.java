package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void testFactorial() {
        assertEquals(40320.0, Factorial.factorial(8));
    }
}
