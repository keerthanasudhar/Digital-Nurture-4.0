package com.example.JUnitDemo;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        System.out.println("Executing testAddition()");
        assertEquals(5, result);
    }
}
