package com.devxschool.one;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTest {
    Calculator calculator;

    // Initialize the Calculator class before each test case and set it to null after each test case to ensure clean state.
    @BeforeMethod
    public void beforeMethod() {
        // TODO complete the method
        calculator = new Calculator();
    }

    @AfterMethod
    public void afterMethod() {
        // TODO complete the method
        calculator = null;

    }
    // Positive test cases

    // Test the addition method of the Calculator class using a positive test case with valid
    // inputs and assert that the output is correct.

    @Test
    public void testAddition() {
        // TODO complete the test
       // calculator.add(10,10);
        Assert.assertEquals(20, calculator.add(10,10));

    }

    // Test the subtraction method of the Calculator class using a positive test case with valid
    // inputs and assert that the output is correct.
    @Test
    public void testSubtraction() {
        // TODO complete the test
        Assert.assertEquals(20,calculator.subtract(30,10));
    }

    // Test the multiplication method of the Calculator class using a positive test case with valid
    // inputs and assert that the output is correct.
    @Test
    public void testMultiplication() {
        // TODO complete the test
        Assert.assertEquals(4, calculator.multiply(2,2));
    }

    // Test the division method of the Calculator class using a positive test case with valid
    // inputs and assert that the output is correct.
    @Test
    public void testDivision() {
        // TODO complete the test
        Assert.assertEquals(5, calculator.divide(10,2));
    }

    // Test the division method of the Calculator class using a positive test case with valid
    // inputs and assert that the output is correct.
    @Test
    public void testDivisionWithDouble() {
        // TODO complete the test
        Assert.assertEquals(5.0, calculator.divide(10.0, 2.0));
    }

    // Test the mod method of the Calculator class using a positive test case with valid
    // inputs and assert that the output is correct.
    @Test
    public void testMod() {
        // TODO complete the test
        Assert.assertEquals(calculator.mod(10,2), 0);
    }

    // Negative test cases

    // Test the division method of the Calculator class using a negative test case with
    // an input of zero as the denominator and assert that the correct exception is thrown.
    @Test (expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        // TODO complete the test
        calculator.divide(40,0);

    }
    // Test the division method of the Calculator class using a negative
    // test case with an input of zero as the denominator and assert that the correct exception is thrown.
    @Test (expectedExceptions =ArithmeticException.class)
    public void testDivisionByZeroWithDouble() {
        // TODO complete the test
        calculator.divide(40.0,0.0);

    }

    // Test the mod method of the Calculator class using a negative test
    // case with an input of zero as the denominator and assert that the correct exception is thrown.
    @Test (expectedExceptions =ArithmeticException.class)
    public void testModByZero() {
        // TODO complete the test
        calculator.mod(40,0);
    }
}