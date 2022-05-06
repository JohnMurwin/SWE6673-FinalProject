package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class VampireNumberTest {
    @Test
    void testIsVampireNumber() {
        assertFalse(VampireNumber.isVampireNumber(4, 11, true));
    }

    @Test
    void testSplitIntoDigits() {
        assertEquals("2245", VampireNumber.splitIntoDigits(45, 22));
    }
}
