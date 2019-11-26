package cs2017.v0;

public class Circle extends Point{
    private int radius;
    final static double PI=3.14;
    public int getRadius() {

        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Circle(){
        System.out.println("这是圆的无参构造");
    }

    public Circle(int radius,int x, int y) {
        super(x, y);
        this.radius=radius;
    }

    public Circle(int radius){
        this.radius=radius;
    }

    //圆面积
    public double Area(){
        double area;
        area=PI*radius*radius;
        return area;
    }
     public String toString(){
        String str="圆类点的坐标为:"+this.getX()+","+this.getY()+"\t"+"半径为:"+this.getRadius()+"\t圆的面积为:"+Area();
         System.out.println(str);
        return str;
     }

}
