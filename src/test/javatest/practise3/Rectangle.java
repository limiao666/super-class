package test.javatest.practise3;

public class Rectangle implements Shape {
    private int width;
    private int length;

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


    @Override
    public void getCircumference() {
        System.out.println("矩形的周长为:"+2*(length+width));
    }

    @Override
    public void getArea() {
        System.out.println("矩形的面积为:"+length*width);
    }
}
