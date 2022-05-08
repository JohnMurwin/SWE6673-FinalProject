package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class ArmstrongTest {
    @Test
    void testIsArmstrong() {
        assertFalse(Armstrong.isArmstrong(5));
    }
}
