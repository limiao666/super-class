package cs2017.factor;


import cs2017.v0.Point;
import cs2017.v2.Circle;
import cs2017.v2.Rectangle;


public class TestV2 {
    public static void main(String[] args) {
        Rectangle rc=new Rectangle(5,6,new Point(5,6));
        rc.getArea();

        Circle cr=new Circle(8,new Point(8,8));

        cr.getArea();

    }
}
