package com.softserve.edu.service;

import java.util.Objects;

public class SumOfSquares {
    private int x;
    private int y;
    private int n;

    public SumOfSquares(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getN() {
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SumOfSquares)) return false;
        SumOfSquares that = (SumOfSquares) o;
        return x == that.x &&
                y == that.y &&
                n == that.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, n);
    }

    @Override
    public String toString() {
        return x + "^2" + " + " + y + "^2" + " = " + n;
    }

}
