package org.example;

public class QuadraticEquation { //ax^2+bx+c=0
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        if(a==0){
            throw  new IllegalArgumentException("Не квадратный трехчлен");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double [] solveEquation(){
        double[] rootsArray = new double[2];
        double D = b*b-4*a*c;
        if(D<0){
            rootsArray = null;
        }
        if(D>=0){
            rootsArray[0] = (-b+Math.sqrt(D))/(2*a);
            rootsArray[1] = (-b-Math.sqrt(D))/(2*a);
        }
        return rootsArray;
    }
}
