package com.cict6thedition.ArraysAndStrings.Q108ZeroMatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    void testRotate() {
        int[][] matrix1 = new int[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;

        int[][] matrix2 = new int[2][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;


        assertEquals(true, QuestionA.matricesAreEqual(matrix1, matrix2));
    }
}
