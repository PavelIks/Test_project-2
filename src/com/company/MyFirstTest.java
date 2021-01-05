package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class MyFirstTest
{
    private final Sum1 sum1 = new Sum1();
    private final Sum2 sum2 = new Sum2();
    private final Sum3 sum3 = new Sum3();
    private final Min1 min1 = new Min1();

    @Test
    void test1()
    {
        int[] Array = { 1, 2, 3, 4, 5 };
        assertEquals(15, sum1.MySum1(Array));
    }

    @Test
    void test2()
    {
        assertEquals(18, sum2.MySum2(17, 1));
    }

    @Test
    void test3()
    {
        int[] Array = { 1, 2, 3, 4, 5 };
        assertEquals(15, sum3.MySum3(Array));
    }

    @Test
    void test4()
    {
        assertEquals(-1, min1.MyMin1(7, 8));
    }
}