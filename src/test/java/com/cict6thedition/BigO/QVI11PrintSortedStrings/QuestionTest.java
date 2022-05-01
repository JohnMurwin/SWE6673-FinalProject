package com.cict6thedition.BigO.QVI11PrintSortedStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testisInOrder() {
        assertEquals(true, Question.isInOrder("abc"));
    }
}
