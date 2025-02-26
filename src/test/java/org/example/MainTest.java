package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Test squareRoot with positive input
    @Test
    public void testSquareRoot() {
        assertEquals(1.0, Main.squareRoot(4.0), 0.0001);
        assertEquals(3.0, Main.squareRoot(9.0), 0.0001);
    }

    // Test squareRoot with negative input
    @Test
    public void testSquareRootNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Main.squareRoot(-1), "Cannot calculate square root of a negative number");
    }

    // Test factorial with positive input
    @Test
    public void testFactorial() {
        assertEquals(120, Main.factorial(5), 0.0001);
        assertEquals(3628800, Main.factorial(10), 0.0001);
    }

    // Test factorial with 0
    @Test
    public void testFactorialZero() {
        assertEquals(1, Main.factorial(0));
    }

    // Test factorial with negative input
    @Test
    public void testFactorialNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorial(-1), "Cannot calculate factorial of a negative number");
    }

    // Test naturalLog with positive input
    @Test
    public void testNaturalLog() {
        assertEquals(1.7917, Main.naturalLogarithm(6.0), 0.0001);
    }

    // Test naturalLog with negative input
    @Test
    public void testNaturalLogNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Main.naturalLogarithm(-1), "Cannot calculate logarithm of a non-positive number");
    }

    // Test naturalLog with input 1 (should be 0)
    @Test
    public void testNaturalLogOne() {
        assertEquals(0, Main.naturalLogarithm(1), 0.0001);
    }

    // Test power function with positive exponents
    @Test
    public void testPower() {
        assertEquals(8.0, Main.power(2.0, 3.0), 0.0001);
        assertEquals(1024.0, Main.power(2.0, 10.0), 0.0001);
    }

    // Test power function with negative exponents
    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.25, Main.power(2, -2), 0.0001);
    }
}
