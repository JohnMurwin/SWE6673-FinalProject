package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void multiplicationTest()
    {
        assertEquals(0, Multiplication.multiplication(0,1));
        assertEquals(0, Multiplication.multiplication(1,0));
        assertEquals(0, Multiplication.multiplication(-1,0));
        assertEquals(0, Multiplication.multiplication(0,-1));
        assertEquals(1, Multiplication.multiplication(1,1));
        assertEquals(-1, Multiplication.multiplication(-1,1));
        assertEquals(-1, Multiplication.multiplication(1,-1));
        assertEquals(-1, Multiplication.multiplication(-1,1));
        assertEquals(1, Multiplication.multiplication(-1,-1));
    }

    @Test
    void multiplyUsingLoopTest()
    {
        assertEquals(0, Multiplication.multiplyUsingLoop(0,1));
        assertEquals(1, Multiplication.multiplyUsingLoop(1,0));
        assertEquals(-1, Multiplication.multiplyUsingLoop(-1,0));
        assertEquals(0, Multiplication.multiplyUsingLoop(0,-1));
        assertEquals(1, Multiplication.multiplyUsingLoop(1,1));
        assertEquals(-1, Multiplication.multiplyUsingLoop(-1,1));
        assertEquals(-1, Multiplication.multiplyUsingLoop(1,-1));
        assertEquals(-1, Multiplication.multiplyUsingLoop(-1,1));
        assertEquals(1, Multiplication.multiplyUsingLoop(-1,-1));
    }

    @Test
    void multiplyUsingRecursionTest()
    {
        assertEquals(0, Multiplication.multiplyUsingRecursion(0,1));
        assertEquals(2, Multiplication.multiplyUsingRecursion(1,0));
        assertEquals(-2, Multiplication.multiplyUsingRecursion(-1,0));
        assertEquals(0, Multiplication.multiplyUsingRecursion(0,-1));
        assertEquals(1, Multiplication.multiplyUsingRecursion(1,1));
        assertEquals(-1, Multiplication.multiplyUsingRecursion(-1,1));
        assertEquals(1, Multiplication.multiplyUsingRecursion(1,-1));
        assertEquals(-1, Multiplication.multiplyUsingRecursion(-1,1));
        assertEquals(-1, Multiplication.multiplyUsingRecursion(-1,-1));
    }

    @Test
    void multiplyUsingShiftTest()
    {
        assertEquals(0, Multiplication.multiplyUsingShift(0,1));
        assertEquals(0, Multiplication.multiplyUsingShift(1,0));
        assertEquals(0, Multiplication.multiplyUsingShift(-1,0));
        assertEquals(0, Multiplication.multiplyUsingShift(0,-1));
        assertEquals(1, Multiplication.multiplyUsingShift(1,1));
        assertEquals(-1, Multiplication.multiplyUsingShift(-1,1));
        assertEquals(-1, Multiplication.multiplyUsingShift(1,-1));
        assertEquals(-1, Multiplication.multiplyUsingShift(-1,1));
        assertEquals(1, Multiplication.multiplyUsingShift(-1,-1));
    }

    @Test
    void multiplyUsingLogsTest()
    {
        assertEquals(0, Multiplication.multiplyUsingLogs(0,1));
        assertEquals(0, Multiplication.multiplyUsingLogs(1,0));
        assertEquals(0, Multiplication.multiplyUsingLogs(-1,0));
        assertEquals(0, Multiplication.multiplyUsingLogs(0,-1));
        assertEquals(1, Multiplication.multiplyUsingLogs(1,1));
        assertEquals(-1, Multiplication.multiplyUsingLogs(-1,1));
        assertEquals(-1, Multiplication.multiplyUsingLogs(1,-1));
        assertEquals(-1, Multiplication.multiplyUsingLogs(-1,1));
        assertEquals(1, Multiplication.multiplyUsingLogs(-1,-1));
    }

    @Test
    void multiplyUsingFFTTest()
    {
        assertEquals("0", Multiplication.multiplyUsingFFT("0","1"));
        assertEquals("0", Multiplication.multiplyUsingFFT("1","0"));
        assertEquals("0", Multiplication.multiplyUsingFFT("-1","0"));
        assertEquals("0", Multiplication.multiplyUsingFFT("0","-1"));
        assertEquals("1", Multiplication.multiplyUsingFFT("1","1"));
        assertEquals("-1", Multiplication.multiplyUsingFFT("-1","1"));
        assertEquals("-1", Multiplication.multiplyUsingFFT("1","-1"));
        assertEquals("-1", Multiplication.multiplyUsingFFT("-1","1"));
        assertEquals("1", Multiplication.multiplyUsingFFT("-1","-1"));
    }

    @Test
    void multiplyUsingLoopWithStringInputTest()
    {
        assertEquals("", Multiplication.multiplyUsingLoopWithStringInput("0","1"));
        assertEquals("", Multiplication.multiplyUsingLoopWithStringInput("1","0"));
        assertEquals("-", Multiplication.multiplyUsingLoopWithStringInput("-1","0"));
        assertEquals("-", Multiplication.multiplyUsingLoopWithStringInput("0","-1"));
        assertEquals("1", Multiplication.multiplyUsingLoopWithStringInput("1","1"));
        assertEquals("-1", Multiplication.multiplyUsingLoopWithStringInput("-1","1"));
        assertEquals("-1", Multiplication.multiplyUsingLoopWithStringInput("1","-1"));
        assertEquals("-1", Multiplication.multiplyUsingLoopWithStringInput("-1","1"));
        assertEquals("1", Multiplication.multiplyUsingLoopWithStringInput("-1","-1"));
    }

    @Test
    void multiplyUsingLoopWithIntegerInputTest()
    {
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(0,1));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(1,0));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(-1,0));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(0,-1));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(1,1));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(-1,1));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(1,-1));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(-1,1));
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(-1,-1));
    }
}