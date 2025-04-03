package com;

import static org.junit.jupiter.api.Assertions.*;

import com.PasswordValidator;
import org.junit.jupiter.api.Test;
public class PasswordTest {
    @Test
    public void validpass(){
        assertTrue(PasswordValidator.validate("Madhav123"));
    }
    @Test
    public void invalidpass(){
        assertFalse(PasswordValidator.validate("Madhavmadhav"));
    }

}
