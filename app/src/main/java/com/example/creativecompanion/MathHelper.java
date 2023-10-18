package com.example.creativecompanion;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathHelper {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) { return a - b; }

    public int div(int a, int b) { return a / b; }

    public int mult(int a, int b) { return a * b; }

    public int ave(int a, int b, int c) { return (a + b + c) / 3; }

    public double percent(double a, double b) { return (a / b) / 100; }

    public double power(double a, double b) { return pow(a, b); }

    public double squareRoot(double a) { return sqrt(a); }

    public boolean greater(double a, double b) { return a > b; }

    public boolean lessThan(double a, double b) { return a < b; }

    public boolean equal(double a, double b) { return a == b; }


}

