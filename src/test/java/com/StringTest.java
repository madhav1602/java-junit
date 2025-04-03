package com;

import static org.junit.jupiter.api.Assertions.*;

import com.StringChecker;
import org.junit.jupiter.api.Test;

class StringTest {

    @Test
    void testReverse() {
        assertEquals("987654321", StringChecker.reverse("123456789"));

    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringChecker.isPalindrome("racecar"));

    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringChecker.toUpperCase("hello"));

    }
}
