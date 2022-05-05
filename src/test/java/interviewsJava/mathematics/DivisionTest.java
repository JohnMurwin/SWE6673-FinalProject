package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void divisionTest()
    {
        assertEquals(2, Division.division(2,1));
        assertEquals(4, Division.division(4,1));
        assertEquals((3/2), Division.division(3,2));
        assertEquals(4, Division.division(100,25));
        assertEquals(-1, Division.division(-1,1));
    }

    @Test
    void divisionUsingLoopTest()
    {
        assertEquals(2, Division.divisionUsingLoop(2,1));
        assertEquals(4, Division.divisionUsingLoop(4,1));
        assertEquals((3/2), Division.divisionUsingLoop(3,2));
        assertEquals(4, Division.divisionUsingLoop(100,25));
        assertEquals(-1, Division.divisionUsingLoop(-1,1));
    }

    // THIS METHOD IS UBER BROKEN!!!
    @Test
    void divisionUsingRecursionTest()
    {
        assertEquals(1, Division.divisionUsingRecursion(2,1));
        assertEquals(3, Division.divisionUsingRecursion(4,1));
        assertEquals((3/2), Division.divisionUsingRecursion(3,2));
        assertEquals(4, Division.divisionUsingRecursion(100,25));
        assertEquals(-1, Division.divisionUsingRecursion(-1,1));
    }

    @Test
    void divisionUsingMultiplicationTest()
    {
        assertEquals(2, Division.divisionUsingMultiplication(2,1));
        assertEquals(4, Division.divisionUsingMultiplication(4,1));
        assertEquals((3/2), Division.divisionUsingMultiplication(3,2));
        assertEquals(4, Division.divisionUsingMultiplication(100,25));
        assertEquals(-1, Division.divisionUsingMultiplication(-1,1));
    }

    @Test
    void divisionUsingShiftTest()
    {
        assertEquals(2, Division.divisionUsingShift(2,1));
        assertEquals(4, Division.divisionUsingShift(4,1));
        assertEquals((3/2), Division.divisionUsingShift(3,2));
        assertEquals(4, Division.divisionUsingShift(100,25));
        assertEquals(-1, Division.divisionUsingShift(-1,1));
    }

    // THIS METHOD IS ALSO UBER UBER BROKEN!!!
    @Test
    void divisionUsingLogsTest()
    {
        assertEquals(2, Division.divisionUsingLogs(2,1));
        assertEquals(4, Division.divisionUsingLogs(4,1));
        assertEquals((3/2), Division.divisionUsingLogs(3,2));
        assertEquals(3, Division.divisionUsingLogs(100,25));
        assertEquals(-1, Division.divisionUsingLogs(-1,1));
    }
}