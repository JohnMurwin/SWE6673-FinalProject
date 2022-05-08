package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeonardoNumberTest {
    @Test
    void testLeonardoNumber() {
        assertEquals(15, LeonardoNumber.leonardoNumber(5));
    }
}
