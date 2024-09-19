package org.example;

public class Point {

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double distance() {
        return Math.abs(Math.sqrt(((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y))));

    }

    public double distance(int x, int y) {
        return Math.abs(Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y))));
    }

    public double distance(Point b){
        return Math.abs(Math.sqrt(((b.x - this.x) * (b.x - this.x)) + ((b.y - this.y) * (b.y - this.y))));

    }
}
