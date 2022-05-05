package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void gcdUsingRecursionTest()
    {
        assertEquals(1, GreatestCommonDivisor.gcdUsingRecursion(1,2));
        assertEquals(2, GreatestCommonDivisor.gcdUsingRecursion(4,2));
        assertEquals(1, GreatestCommonDivisor.gcdUsingRecursion(1,12));
        assertEquals(3, GreatestCommonDivisor.gcdUsingRecursion(3,30));
        assertEquals(50, GreatestCommonDivisor.gcdUsingRecursion(100,50));
        assertEquals(14, GreatestCommonDivisor.gcdUsingRecursion(42,56));
        assertEquals(18, GreatestCommonDivisor.gcdUsingRecursion(461952,116298));
        assertEquals(526, GreatestCommonDivisor.gcdUsingRecursion(24826148,45296490));
    }

    @Test
    void gcdUsingEuclidesTest()
    {
        assertEquals(1, GreatestCommonDivisor.gcdUsingEuclides(1,2));
        assertEquals(2, GreatestCommonDivisor.gcdUsingEuclides(4,2));
        assertEquals(1, GreatestCommonDivisor.gcdUsingEuclides(1,12));
        assertEquals(3, GreatestCommonDivisor.gcdUsingEuclides(3,30));
        assertEquals(50, GreatestCommonDivisor.gcdUsingEuclides(100,50));
        assertEquals(14, GreatestCommonDivisor.gcdUsingEuclides(42,56));
        assertEquals(18, GreatestCommonDivisor.gcdUsingEuclides(461952,116298));
        assertEquals(526, GreatestCommonDivisor.gcdUsingEuclides(24826148,45296490));
    }

}