package com.company;

import java.util.*;

/**
 * Created by jq210 on 12/19/16.
 */
public class Point
{
    private int compPoint;
    public Random rdm = new Random();

    public int setPoint()
    {
        compPoint = rdm.nextInt(3);
        return compPoint;
    }
}
