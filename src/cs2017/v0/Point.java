package cs2017.v0;

public class Point {
    private int y;
    private int x;
    public Point(){
        System.out.println("无参构造");
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        String str="父类点的坐标为:"+this.x+","+this.y;
        System.out.println(str);
        return str;

    }

}
