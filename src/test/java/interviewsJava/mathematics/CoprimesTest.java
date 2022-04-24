package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoprimesTest {

    @Test
    void getNumberOfCoprimesTest()
    {
        assertEquals(4, Coprimes.getNumberOfCoprimes(10));
    }

}