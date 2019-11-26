package cs2017.v2;

import cs2017.v0.Point;

public class Rectangle extends Shape {
    private int width;
    private int length;

    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public void setPoint(Point point) {
        this.point = point;
    }

    private Point point;
    public Rectangle(int width,int length,Point point){
        this.length=length;
        this.width=width;
        this.point=point;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }




    @Override
    public void getArea() {
        System.out.println("长方形的面积为:"+length*width+"\t点的坐标为:"+getPoint());
    }
}
