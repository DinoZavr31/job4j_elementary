package ru.job4j.ru.job4j.ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170then80() {
        short in1 = 170;
        double expected1 = 69;
        double out1 = Fit.womanWeight(in1);
        Assert.assertEquals(expected1, out1, 0.01);
    }
}