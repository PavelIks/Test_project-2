package com.company;
import java.util.stream.IntStream;

public class Sum1
{
    int MySum1(int[] items)
    {
        return IntStream.of(items).sum();
    }
}