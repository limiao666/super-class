package cs2017.v1;

import cs2017.v0.Point;

public class Shape {
    private Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Shape(Point point){
        this.point=point;
    }

    public String toString(){
        String str="shape点的坐标为:"+getPoint();
        System.out.println(str);
        return str;

    }


}
