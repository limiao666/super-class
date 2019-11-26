package test.javatest.rd;

public class JavaTest {
    public static void main(String[] args) {
        Point pl=new Point();
        pl.disp();
        pl.set_position(3.2,5.6);
        pl.disp();
        System.out.println("以下是实例化对象p2:");
        Point p2=new Point();
        p2.set_position(2.5,3.5);
        p2.toString();

    }
}
