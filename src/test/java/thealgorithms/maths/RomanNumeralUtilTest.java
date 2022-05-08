package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralUtilTest {
    @Test
    void testGenerate() {
        assertEquals("X", RomanNumeralUtil.generate(10));
    }
}
