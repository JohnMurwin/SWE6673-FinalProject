package interviewsJava.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    @Test
    void fibonacciSequenceUsingLoop()
    {
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingLoop(1));
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingLoop(2));
        assertEquals(2, FibonacciSequence.fibonacciSequenceUsingLoop(3));
        assertEquals(3, FibonacciSequence.fibonacciSequenceUsingLoop(4));
        assertEquals(5, FibonacciSequence.fibonacciSequenceUsingLoop(5));
        assertEquals(8, FibonacciSequence.fibonacciSequenceUsingLoop(6));
        assertEquals(13, FibonacciSequence.fibonacciSequenceUsingLoop(7));
        assertEquals(21, FibonacciSequence.fibonacciSequenceUsingLoop(8));
        assertEquals(34, FibonacciSequence.fibonacciSequenceUsingLoop(9));
        assertEquals(55, FibonacciSequence.fibonacciSequenceUsingLoop(10));
        assertEquals(89, FibonacciSequence.fibonacciSequenceUsingLoop(11));
        assertEquals(144, FibonacciSequence.fibonacciSequenceUsingLoop(12));
        assertEquals(233, FibonacciSequence.fibonacciSequenceUsingLoop(13));
        assertEquals(377, FibonacciSequence.fibonacciSequenceUsingLoop(14));
        assertEquals(610, FibonacciSequence.fibonacciSequenceUsingLoop(15));
        assertEquals(987, FibonacciSequence.fibonacciSequenceUsingLoop(16));
        assertEquals(1597, FibonacciSequence.fibonacciSequenceUsingLoop(17));
        assertEquals(2584, FibonacciSequence.fibonacciSequenceUsingLoop(18));
        assertEquals(4181, FibonacciSequence.fibonacciSequenceUsingLoop(19));
    }

    @Test
    void fibonacciSequenceUsingRecursion()
    {
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingRecursion(1));
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingRecursion(2));
        assertEquals(2, FibonacciSequence.fibonacciSequenceUsingRecursion(3));
        assertEquals(3, FibonacciSequence.fibonacciSequenceUsingRecursion(4));
        assertEquals(5, FibonacciSequence.fibonacciSequenceUsingRecursion(5));
        assertEquals(8, FibonacciSequence.fibonacciSequenceUsingRecursion(6));
        assertEquals(13, FibonacciSequence.fibonacciSequenceUsingRecursion(7));
        assertEquals(21, FibonacciSequence.fibonacciSequenceUsingRecursion(8));
        assertEquals(34, FibonacciSequence.fibonacciSequenceUsingRecursion(9));
        assertEquals(55, FibonacciSequence.fibonacciSequenceUsingRecursion(10));
        assertEquals(89, FibonacciSequence.fibonacciSequenceUsingRecursion(11));
        assertEquals(144, FibonacciSequence.fibonacciSequenceUsingRecursion(12));
        assertEquals(233, FibonacciSequence.fibonacciSequenceUsingRecursion(13));
        assertEquals(377, FibonacciSequence.fibonacciSequenceUsingRecursion(14));
        assertEquals(610, FibonacciSequence.fibonacciSequenceUsingRecursion(15));
        assertEquals(987, FibonacciSequence.fibonacciSequenceUsingRecursion(16));
        assertEquals(1597, FibonacciSequence.fibonacciSequenceUsingRecursion(17));
        assertEquals(2584, FibonacciSequence.fibonacciSequenceUsingRecursion(18));
        assertEquals(4181, FibonacciSequence.fibonacciSequenceUsingRecursion(19));
    }

    @Test
    void fibonacciSequenceUsingMatrixMultiplication()
    {
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(1));
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(2));
        assertEquals(2, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(3));
        assertEquals(3, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(4));
        assertEquals(5, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(5));
        assertEquals(8, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(6));
        assertEquals(13, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(7));
        assertEquals(21, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(8));
        assertEquals(34, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(9));
        assertEquals(55, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(10));
        assertEquals(89, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(11));
        assertEquals(144, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(12));
        assertEquals(233, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(13));
        assertEquals(377, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(14));
        assertEquals(610, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(15));
        assertEquals(987, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(16));
        assertEquals(1597, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(17));
        assertEquals(2584, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(18));
        assertEquals(4181, FibonacciSequence.fibonacciSequenceUsingMatrixMultiplication(19));
    }

    @Test
    void fibonacciSequenceUsingBinetsFormula()
    {
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(1));
        assertEquals(1, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(2));
        assertEquals(2, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(3));
        assertEquals(3, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(4));
        assertEquals(5, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(5));
        assertEquals(8, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(6));
        assertEquals(13, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(7));
        assertEquals(21, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(8));
        assertEquals(34, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(9));
        assertEquals(55, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(10));
        assertEquals(89, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(11));
        assertEquals(144, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(12));
        assertEquals(233, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(13));
        assertEquals(377, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(14));
        assertEquals(610, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(15));
        assertEquals(987, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(16));
        assertEquals(1597, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(17));
        assertEquals(2584, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(18));
        assertEquals(4181, FibonacciSequence.fibonacciSequenceUsingBinetsFormula(19));
    }
}