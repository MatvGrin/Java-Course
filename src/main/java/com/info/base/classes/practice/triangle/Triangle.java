package com.info.base.classes.practice.triangle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;
    private final double ab;
    private final double bc;
    private final double ca;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = sqrt((pow(a.getX() - b.getX(), 2)) + (pow(a.getY() - b.getY(), 2)));
        this.bc = sqrt((pow(b.getX() - c.getX(), 2)) + (pow(b.getY() - c.getY(), 2)));
        this.ca = sqrt((pow(c.getX() - a.getX(), 2)) + (pow(c.getY() - a.getY(), 2)));
        if (ab >= bc + ca || ca >= ab + bc || bc >= ab + ca) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double p = (ab + bc + ca) / 2;
        return sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    public Point centroid() {
        double xm = (a.getX() + b.getX()) / 2;
        double ym = (a.getY() + b.getY()) / 2;
        double x = ((xm - c.getX()) * 2 / 3) + c.getX();
        double y = ((ym - c.getY()) * 2 / 3) + c.getY();
        return new Point(x,y);
    }

}
