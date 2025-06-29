package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {
   
        assertEquals(5, 2 + 3, "2 + 3 must be equal to 5");
        assertTrue(5 > 3, "value is greater than 3");
        assertFalse(5 < 3, " value is  less than 3");
        assertNull(null, "expected value is  null");
        assertNotNull(new Object(), "expected value is null");
    }
}

