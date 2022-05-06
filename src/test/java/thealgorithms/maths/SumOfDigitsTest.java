package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfDigitsTest {
    @Test
    void testSumOfDigits() {
        assertEquals(10, SumOfDigits.sumOfDigits(1234));
    }

    @Test
    void testSumOfDigitsFast() {
        assertEquals(15, SumOfDigits.sumOfDigitsFast(1356));
    }

    @Test
    void testSumOfDigitsRecursion() {
        assertEquals(22, SumOfDigits.sumOfDigitsRecursion(4567));
    }
}
