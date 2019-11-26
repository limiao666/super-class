package test.javatest.practise3;

public class Triangle implements Shape {
    private int bottom;
    private int height;
    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void getCircumference() {
        System.out.println("三角形的周长为:"+3*bottom);
    }

    @Override
    public void getArea() {
        System.out.println("三角形的面积为:"+bottom*height/2);
    }
}
