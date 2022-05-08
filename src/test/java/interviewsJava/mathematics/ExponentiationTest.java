package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {

    @Test
    void recusiveExponentiationTest()
    {
        assertEquals(0, Exponentiation.recursiveExponentiation(0,1));
        assertEquals(1, Exponentiation.recursiveExponentiation(1,0));
        assertEquals(1, Exponentiation.recursiveExponentiation(1,1));
        assertEquals(1, Exponentiation.recursiveExponentiation(1,2));
        assertEquals(1, Exponentiation.recursiveExponentiation(1,100));
        assertEquals(2, Exponentiation.recursiveExponentiation(2,1));
        assertEquals(4, Exponentiation.recursiveExponentiation(2,2));
    }

    @Test
    void fastRecusiveExponentiationTest()
    {
        assertEquals(0, Exponentiation.fastRecursiveExponentiation(0,1));
        assertEquals(1, Exponentiation.fastRecursiveExponentiation(1,1));
        assertEquals(1, Exponentiation.fastRecursiveExponentiation(1,0));
        assertEquals(1, Exponentiation.fastRecursiveExponentiation(1,2));
        assertEquals(1, Exponentiation.fastRecursiveExponentiation(1,100));
        assertEquals(2, Exponentiation.fastRecursiveExponentiation(2,1));
        assertEquals(4, Exponentiation.fastRecursiveExponentiation(2,2));
    }

    @Test
    void fastRecusiveExponentiationModuloTest()
    {
        assertEquals(0, Exponentiation.fastRecursiveExponentiationModulo(0,1, 1));
        assertEquals(1, Exponentiation.fastRecursiveExponentiationModulo(0,0, 1));
        assertEquals(1, Exponentiation.fastRecursiveExponentiationModulo(1,1, 1));
        assertEquals(0, Exponentiation.fastRecursiveExponentiationModulo(1,2,1));
        assertEquals(0, Exponentiation.fastRecursiveExponentiationModulo(1,100,1));
        assertEquals(2, Exponentiation.fastRecursiveExponentiationModulo(2,1, 1));
        assertEquals(0, Exponentiation.fastRecursiveExponentiationModulo(2,2, 1));

    }

}