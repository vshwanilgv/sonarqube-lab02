package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calculator.calculate(10, 5, "add"));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.calculate(10, 5, "sub"));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calculator.calculate(10, 5, "mul"));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.calculate(10, 5, "div"));
    }

    @Test
    void testDivideByZero() {
        assertEquals(0, calculator.calculate(10, 0, "div"));
    }

    @Test
    void testModulo() {
        assertEquals(1, calculator.calculate(10, 3, "mod"));
    }

    @Test
    void testPower() {
        assertEquals(100, calculator.calculate(10, 2, "pow"));
    }

    @Test
    void testUnknownOperation() {
        assertEquals(0, calculator.calculate(10, 5, "unknown"));
    }
}
