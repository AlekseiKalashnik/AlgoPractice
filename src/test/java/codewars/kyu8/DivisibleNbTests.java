package codewars.kyu8;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class DivisibleNbTests {

    @Test
    public void test1() {
        assertEquals("n = 12, x = 4, y = 3\n", true, DivisibleNb.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals("n = 3, x = 3, y = 4\n", false, DivisibleNb.isDivisible(3,3,4));
    }

}
