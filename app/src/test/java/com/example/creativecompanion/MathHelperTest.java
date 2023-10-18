package com.example.creativecompanion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathHelperTest {
    @Test
    public void testAddition() {
        MathHelper mathHelper = new MathHelper();
        int result = mathHelper.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        MathHelper mathHelper = new MathHelper();
        int result = mathHelper.sub(2, 3);
        assertEquals(-1, result);
    }

    @Test
    public void testDivision() {
        MathHelper mathHelper = new MathHelper();
        int result = mathHelper.div(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        MathHelper mathHelper = new MathHelper();
        int result = mathHelper.mult(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testAverage() {
        MathHelper mathHelper = new MathHelper();
        int result = mathHelper.ave(1, 2, 3);
        assertEquals(2, result);
    }

    @Test
    public void testPercent() {
        MathHelper mathHelper = new MathHelper();
        double result = mathHelper.percent(150, 3);
        assertEquals(.5, result, 0);
    }

    @Test
    public void testPower() {
        MathHelper mathHelper = new MathHelper();
        double result = mathHelper.power(2, 3);
        assertEquals(8, result, 0);
    }

    @Test
    public void testSquareRoot() {
        MathHelper mathHelper = new MathHelper();
        double result = mathHelper.squareRoot(9);
        assertEquals(3, result, 0);
    }

    @Test
    public void testGreater() {
        MathHelper mathHelper = new MathHelper();
        boolean result = mathHelper.greater(2, 3);
        assertEquals(false, result);
    }

    @Test
    public void testLessThan() {
        MathHelper mathHelper = new MathHelper();
        boolean result = mathHelper.lessThan(2, 3);
        assertEquals(true, result);
    }

    @Test
    public void testEqual() {
        MathHelper mathHelper = new MathHelper();
        boolean result = mathHelper.equal(2, 3);
        assertEquals(false, result);
    }




}
