package cs2017.v3;

import cs2017.v0.Point;

public class Rectangle implements Shape {
    private Point point;
    private int width;
    private int length;
   public Rectangle(int width,int length,Point point){
       this.width=width;
       this.length=length;
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


    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


    @Override
    public void getArea() {
        System.out.println("长方形的面积为:"+length*width);
    }

    @Override
    public void getC() {
        System.out.println("长方形点的坐标为:"+getPoint());
    }
}
