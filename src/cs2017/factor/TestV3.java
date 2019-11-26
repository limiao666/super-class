package cs2017.factor;

import cs2017.v0.Point;
import cs2017.v3.Circle;
import cs2017.v3.Rectangle;

public class TestV3 {
    public static void main(String[] args) {
        Rectangle rc=new Rectangle(2,3,new Point(3,4));

        rc.getArea();
        rc.getC();


        Circle cr=new Circle(new Point(6,6),6);
           cr.getArea();
           cr.getC();

    }
}
