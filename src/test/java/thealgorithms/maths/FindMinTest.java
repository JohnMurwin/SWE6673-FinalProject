package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindMinTest {
    @Test
    void testFindMin() {
        int testMin[] = {1,2,3};
        assertEquals(1, FindMin.findMin(testMin));
    }
}
