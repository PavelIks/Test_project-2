package com.company;

public class Sum3
{
    int MySum3(int[] items)
    {
        int sum = 0;
        for (int i = 0; i < items.length; i++)
        {
            sum += items[i];
        }
        return sum;
    }
}