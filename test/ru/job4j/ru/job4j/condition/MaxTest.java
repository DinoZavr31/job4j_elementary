package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void max() {
        int expected = 3;
        int out = Max.max(3, 2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max1() {
        int expected = 4;
        int out = Max.max(3, 4);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max3() {
        int expected = 3;
        int out = Max.max(3, 3);
        Assert.assertEquals(expected, out);
    }
}