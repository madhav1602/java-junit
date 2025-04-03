package com;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DivideByZeroTest {
    @Test
    public void divide() {

        assertEquals(1, DivideByZero.divide(5, 5));
    }

    @Test
    public void testException(){
        assertThrows(ArithmeticException.class, ()-> {DivideByZero.divide(5,0);});
    }
}
