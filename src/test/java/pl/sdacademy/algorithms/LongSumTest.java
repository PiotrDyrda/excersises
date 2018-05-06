package pl.sdacademy.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongSumTest {

    private LongSum sum;

    @Before
    public void init() {
        sum = new LongSum();
    }

    @Test
    public void testSum1() {
        Long[] longs = {123L, 234L, 456L, 567L, 789L, 890L};
        String sum = this.sum.sum(longs);
        assertEquals("3059", sum);
    }

    @Test
    public void testSum2() {
        Long[] longs = {34514521435L, 2314312512L, 2314516147752L, 21341234123L};
        String sum = this.sum.sum(longs);
        assertEquals("2372686215822", sum);
    }

    @Test
    public void testSum() {
        Long[] longs = new Long[103];
        for (int i = 0; i < 100; i++) {
            longs[i] = Long.MAX_VALUE;
        }
        longs[100] = 213L;
        longs[101] = 897124123L;
        longs[102] = 87190L;
        String sum = this.sum.sum(longs);
        assertEquals("922337203686374792226", sum);
    }

}