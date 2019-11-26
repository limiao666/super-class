package cs2017.v2;

import cs2017.v0.Point;

public abstract class Shape {
    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    private Point point;
    public abstract void getArea();
}
