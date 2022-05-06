package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindMaxTest {
    @Test
    void testFindMax() {
        int testMax[] = {2,4,6};
        assertEquals(6, FindMax.findMax(testMax));
    }
}
