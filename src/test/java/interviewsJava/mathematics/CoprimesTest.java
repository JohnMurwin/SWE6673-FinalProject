package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoprimesTest {

    @Test
    void getNumberOfCoprimesTest()
    {
        assertEquals(0, Coprimes.getNumberOfCoprimes(0));
        assertEquals(1, Coprimes.getNumberOfCoprimes(1));
        assertEquals(4, Coprimes.getNumberOfCoprimes(10));
    }
}