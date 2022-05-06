package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AverageTest {
    @Test
    void testAverage() {
        double testDoubles[] = {1.4,1.4,1.4};
        assertEquals(1.3999999999999997, Average.average(testDoubles));
    }

    @Test
    void testAverage2() {
        int testInts[] = {2,3,4};
        assertEquals(3, Average.average(testInts));
    }
}
