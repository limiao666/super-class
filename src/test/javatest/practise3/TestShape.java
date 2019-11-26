package test.javatest.practise3;

public class TestShape {
    public static void main(String[] args) {
        //测试圆
        Circle cr=new Circle();
        cr.setR(3);
        cr.getArea();
        cr.getCircumference();

        //测试矩形
        Rectangle rc=new Rectangle();
        rc.setLength(3);
        rc.setWidth(4);
        rc.getArea();
        rc.getCircumference();

        //测试三角形
        Triangle tr=new Triangle();
        tr.setHeight(4);
        tr.setBottom(6);
        tr.getArea();
        tr.getCircumference();

    }

}
