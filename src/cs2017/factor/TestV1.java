package cs2017.factor;

import cs2017.v0.Point;
import cs2017.v1.Rectangle;
import cs2017.v1.Shape;

public class TestV1 {
    public static void main(String[] args) {
        Shape sp=new Shape(new Point(9,9));
        sp.toString();

        Rectangle rc=new Rectangle(new Point(2,2));
        rc.setLength(4);
        rc.setWidth(5);
        rc.toString();
    }
}
