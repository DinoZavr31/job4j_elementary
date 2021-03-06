package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

 public class FactorialTest {

    @Test
    public void calc() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }

     @Test
     public void calc1() {
         int rsl = Factorial.calc(0);
         int expected = 1;
         assertThat(rsl, is(expected));
     }
}