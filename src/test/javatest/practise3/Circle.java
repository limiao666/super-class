package test.javatest.practise3;

public class Circle implements Shape {
    private final double PI=3.14;
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    @Override
    public void getCircumference() {
        System.out.println("圆的周长为:"+2*PI*r);
    }

    @Override
    public void getArea() {
        System.out.println("圆的面积为:"+PI*r*r);
    }
}
