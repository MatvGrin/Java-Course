package com.info.base.classes.practice.segments;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        if (start == null || end == null){
            throw new IllegalArgumentException();
        }
        if (start.getX() == end.getX() && start.getY() == end.getY() ) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    double length() {
        return Math.sqrt((Math.pow(start.getX() - end.getX(), 2))
                + (Math.pow(start.getY() - end.getY(), 2)));
    }

    Point middle() {
        return new Point((start.getX() + end.getX()) / 2,
                (start.getY() + end.getY()) / 2);
    }

    Point intersection(Segment another) {
        double k1 = (start.getY() - end.getY()) / (start.getX() - end.getX());
        double b1 = start.getY() - k1 * start.getX();
        double k2 = (another.start.getY() - another.end.getY()) / (another.start.getX() - another.end.getX());
        double b2 = another.start.getY() - k2 * another.start.getX();

        if (k1 == k2) return null;

        double x = (b2 - b1) / (k1 - k2);
        double y = k1 * x + b1;

        double st1 = min(start.getX(),end.getX());
        double fn1 = max(start.getX(),end.getX());
        double st2 = min(another.start.getX(),another.end.getX());
        double fn2 = max(another.start.getX(),another.end.getX());
        double st3 = min(start.getY(),end.getY());
        double fn3 = max(start.getY(),end.getY());
        double st4 = min(another.start.getY(),another.end.getY());
        double fn4 = max(another.start.getY(),another.end.getY());
        if (x >= st1 && x <= fn1 && x >= st2 && x <= fn2 && y >= st3 && y <= fn3 && y >= st4 && y <= fn4) return new Point(x, y);
        return null;
    }

}
