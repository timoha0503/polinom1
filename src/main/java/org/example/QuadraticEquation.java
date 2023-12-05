package org.example;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation { //ax^2+bx+c=0
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public List<Double> solveEquation() {
        List<Double> roots = new ArrayList<>();
        if (a == 0) {
            roots.add(-c / b);
            return roots;
        }
        double D = b * b - 4 * a * c;
        if (D == 0) {
            roots.add(-b / (2 * a));
        }
        if (D > 0) {
            roots.add((-b + Math.sqrt(D)) / (2 * a));
            roots.add((-b - Math.sqrt(D)) / (2 * a));
        }
        return roots;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
