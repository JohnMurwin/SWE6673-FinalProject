package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void chebyshevDistanceTest()
    {
        long[] array1;
        long[] array2;

        array1 = new long[]{0,0};
        array2 = new long[]{0,0};
        assertEquals(0, Distance.chebyshevDistance(array1,array2));

        array1 = new long[]{1, 2};
        array2 = new long[]{2, 1};
        assertEquals(1, Distance.chebyshevDistance(array1,array2));

        array1 = new long[]{100,100};
        array2 = new long[]{-100,-100};
        assertEquals(200, Distance.chebyshevDistance(array1,array2));

        array1 = new long[]{-100,-100};
        array2 = new long[]{-1000,-1000};
        assertEquals(900, Distance.chebyshevDistance(array1,array2));
    }

    @Test
    void squaredDistanceTest()
    {
        assertEquals(0, Distance.squaredDistance(1,1,1,1));
        assertEquals(0, Distance.squaredDistance(1,-1,1,-1));
        assertEquals(2, Distance.squaredDistance(1,1,0,0));
        assertEquals(8, Distance.squaredDistance(1,1,-1,-1));
        assertEquals(30258, Distance.squaredDistance(123,123,0,0));

    }

    @Test
    void euclideanDistanceTest()
    {
        assertEquals(0, Distance.euclideanDistance(1,1,1,1));
        assertEquals(2.23606797749979, Distance.euclideanDistance(-1,2,0,0));
        assertEquals(1.4142135623730951, Distance.euclideanDistance(1,1,2,2));

    }
}