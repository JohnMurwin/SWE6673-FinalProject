package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralUtilTest {
    @Test
    void testGenerate() {
        assertEquals("X", RomanNumeralUtil.generate(10));
    }
}
