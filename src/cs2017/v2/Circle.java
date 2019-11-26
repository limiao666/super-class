package cs2017.v2;

import cs2017.v0.Point;

public class Circle extends Shape {
    private int radius;
    final static double pi=3.14;
    public Circle(int radius,Point point){
        this.radius=radius;
        this.point=point;
    }
    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public void setPoint(Point point) {
        this.point = point;
    }

    private Point point;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }



    @Override
    public void getArea() {
        System.out.println("圆的面积为:"+radius*radius*pi+"\t点的坐标为:"+getPoint());
    }
}
