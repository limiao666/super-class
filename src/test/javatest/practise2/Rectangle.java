package test.javatest.practise2;

public class Rectangle {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int width;

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public void getArea(){
        System.out.println("长为:"+length+"宽为:"+width+"的长方形面积为:"+length*width);
    }


}
