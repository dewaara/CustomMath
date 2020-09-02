package com.dewaara.myutils;

/*
CustomMath developed by Md.Halim from Dewaara Inc. 31/08/2020
==> Developer Name:- MD.HALIM
==> Android App Name:- CustomMath
==> Address :- Chatra || Jharkhand 825408 || India
==> Copyright 2020 || Dewaara Inc. 31/08/2020 11:25 PM
 */

public class MyMath {

    public static int Plus(int a, int b)
    {
        return a+b;
    }

    public static int Minus(int a, int b)
    {
        return a-b;
    }

    public static int Multi(int a, int b)
    {
        return a*b;
    }

    public static float Div(int a, int b)
    {
        if (b == 0)
            throw new IllegalArgumentException("Div by Zero error");
        else
            return a/b;
    }
}
