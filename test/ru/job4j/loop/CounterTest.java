package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void sumByEven() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumByEven1() {
        int rsl = Counter.sumByEven(5, 200);
        int expected = 10094;
        assertThat(rsl, is(expected));
    }
}