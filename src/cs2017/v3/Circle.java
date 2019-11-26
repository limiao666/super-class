package cs2017.v3;

import cs2017.v0.Point;

public class Circle implements Shape {
    private Point point;
    private int radius;
    final static double pi=3.14;
    public Circle(Point point,int radius){
        this.radius=radius;
        this.point=point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }



    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


    @Override
    public void getArea() {
        System.out.println("圆的面积为;"+radius*radius*pi);
    }

    @Override
    public void getC() {
        System.out.println("圆点坐标为:"+getPoint());
    }
}
