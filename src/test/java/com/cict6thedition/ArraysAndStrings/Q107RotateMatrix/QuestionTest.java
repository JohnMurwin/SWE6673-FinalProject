package com.cict6thedition.ArraysAndStrings.Q107RotateMatrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testRotate() {
        int[][] numbers = new int[2][2];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        assertEquals(true, Question.rotate((numbers)));
    }
}
