package ru.job4j.ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert120RblThen3Dlr() {
            int y = 120;
            int z = 2;
            int p = Converter.rubleToDollar(y);
            Assert.assertEquals(z, p);
        }
    }
