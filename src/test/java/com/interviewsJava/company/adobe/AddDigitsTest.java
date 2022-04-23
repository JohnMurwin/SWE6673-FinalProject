package com.interviewsJava.company.adobe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {

    @Test
    public void testAddDigits()
    {
        assertEquals(2, new AddDigits().addDigits(38));
        assertEquals(1, new AddDigits().addDigits(10));
        assertEquals(9, new AddDigits().addDigits(9));
    }

}