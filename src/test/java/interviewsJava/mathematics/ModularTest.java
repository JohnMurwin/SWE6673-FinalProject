package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModularTest {

    @Test
    void addTest ()
    {
        assertEquals(0, Modular.add(1,1,1));
        assertEquals(0, Modular.add(2,2,1));
        assertEquals(1, Modular.add(2,1,2));
        assertEquals(0, Modular.add(0,4,2));
        assertEquals(1, Modular.add(-1,4,2));
    }

    @Test
    void subtractTest ()
    {
        assertEquals(0, Modular.subtract(1, 1, 1));
        assertEquals(0, Modular.subtract(1, 1, 2));
        assertEquals(0, Modular.subtract(10000000, 10000000, 1));
        assertEquals(0, Modular.subtract(-1, -1, 1));
        assertEquals(0, Modular.subtract(-1, 1, 1));    //! WAT
    }

    @Test
    void multiplyTest ()
    {
        assertEquals(0, Modular.multiply(1, 1, 1));
        assertEquals(1, Modular.multiply(1, 1, 2));
        assertEquals(0, Modular.multiply(2, 2, 2));
        assertEquals(0, Modular.multiply(-1, -1, 1));
        assertEquals(0, Modular.multiply(-1, 1, 1));    //! WAT
    }

    @Test
    void powTest ()
    {
        assertEquals(0, Modular.pow(1, 1, 1));
        assertEquals(1, Modular.pow(1, 1, 2));
        assertEquals(0, Modular.pow(2, 2, 2));
        assertEquals(0, Modular.pow(-1, 1, 1));
        assertEquals(0, Modular.pow(-1, 1, 1));
    }

    @Test
    void divideTest ()
    {
        assertEquals(1, Modular.divide(1, 1, 2));
        assertEquals(0, Modular.divide(0, 1, 2));
        assertEquals(0, Modular.divide(2, 1, 2));
    }
}