package test.javatest.practise2;

public class Cuboid {
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRectangle() {
        return rectangle;
    }

    public void setRectangle(int rectangle) {
        this.rectangle = rectangle;
    }

    private int rectangle;
    private int height;
    public Cuboid(int rectangle,int height){
        this.height=height;
        this.rectangle=rectangle;
    }
    public void getVolume(){
        System.out.println("底面矩形为:"+rectangle+"高为:"+height+"的体积为:"+rectangle*height);
    }
}
