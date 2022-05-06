package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LeonardoNumberTest {
    @Test
    void testLeonardoNumber() {
        assertEquals(15, LeonardoNumber.leonardoNumber(5));
    }
}
