package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    public void testName(){
        assertThrows(IllegalArgumentException.class, ()-> {userRegistration.registerUser(" ","madhav@gmail,com","123Fd");});
    }

    @Test
    public void testMail(){
        assertThrows(IllegalArgumentException.class, ()-> {userRegistration.registerUser("MAdhav ","madhavgmail.com","123Fd");});
    }

    @Test
    public void testPass(){
        assertThrows(IllegalArgumentException.class, ()-> {userRegistration.registerUser("MAdhav ","madhavgmail.com","");});
    }

    @Test
    public void testName1(){
        assertDoesNotThrow(()-> {userRegistration.registerUser("Madhav","madhav@gmail.com","123Fd123");});
    }
}
