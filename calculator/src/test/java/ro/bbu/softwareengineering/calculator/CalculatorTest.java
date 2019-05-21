package ro.bbu.softwareengineering.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() throws Exception {
        this.calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(4, this.calculator.add(2, 2));
        assertEquals(6, this.calculator.add(4, 2));
        assertEquals(-5, this.calculator.add(-6, 1));
        assertEquals(-9, this.calculator.add(-6, -3));
    }

    @Test
    void testSub() {
        assertEquals(0, this.calculator.sub(2, 2));
        assertEquals(2, this.calculator.sub(4, 2));
        assertEquals(-7, this.calculator.sub(-6, 1));
        assertEquals(-3, this.calculator.sub(-6, -3));
    }


    @Test
    void testMult() {
        assertEquals(0, this.calculator.mult(2, 0));
        assertEquals(4, this.calculator.mult(2, 2));
        assertEquals(8, this.calculator.mult(4, 2));
        assertEquals(-6, this.calculator.mult(-6, 1));
        assertEquals(18, this.calculator.mult(-6, -3));
    }

    @Test
    void testDiv() {
        assertThrows(ArithmeticException.class, () -> {
            this.calculator.div(2, 0);
        });
        assertEquals(1, this.calculator.div(2, 2));
        assertEquals(2, this.calculator.div(4, 2));
        assertEquals(-6, this.calculator.div(-6, 1));
        assertEquals(2, this.calculator.div(-6, -3));
    }

    @Test
    void testMax() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.calculator.max();
        });
        assertEquals(-5, this.calculator.max(-16, -44, -5));
        assertEquals(0, this.calculator.max(-16, 0, -5));
        assertEquals(5, this.calculator.max(-16, 5, -44));
        assertEquals(33, this.calculator.max(-16, 14, 33));
        assertEquals(50, this.calculator.max(10, 20, 50));
    }
}
