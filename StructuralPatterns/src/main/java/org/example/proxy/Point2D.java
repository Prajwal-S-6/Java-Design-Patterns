package org.example.proxy;

public class Point2D  {
    private Integer x;
    private Integer y;

    public Point2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
