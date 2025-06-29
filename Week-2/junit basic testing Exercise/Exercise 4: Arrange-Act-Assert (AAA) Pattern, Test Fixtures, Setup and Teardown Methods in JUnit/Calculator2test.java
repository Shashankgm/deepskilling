package com.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculator2test {

    private Calculator2 calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator2();
        System.out.println("Setup complete: Calculator object created.");
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Teardown complete: Test finished.\n");
    }

    @Test
    public void testAddition() {
        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result, "10 + 5 should be 15");
    }

    @Test
    public void testSubtraction() {
        
        int a = 10;
        int b = 4;

        int result = calculator.subtract(a, b);
        assertEquals(6, result, "10 - 4 should be 6");
    }
}
