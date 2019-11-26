package cs2017.v1;

import cs2017.v0.Point;

public class Rectangle extends Shape {
    private int width;
    private int length;
    //构造方法
    public Rectangle(Point point) {
        super(point);
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

   public int Area(){
        int area;
        area=length*width;
        return area;
   }

    public String toString(){
        String str="Rectangle点的坐标为:"+getPoint()+"长方形的长为:"+getLength()+"\t宽为:"+getWidth()+"\t面积为:"+Area();
        System.out.println(str);
        return str;
    }

}
