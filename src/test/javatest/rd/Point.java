package test.javatest.rd;

public class Point {
    double x,y;
    public void set_position(double a,double b){
        x=a;
        y=b;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void disp(){
        System.out.println("点的当前坐标为："+x+","+y);
    }
   public String toString(){
      String str="点的坐标为:"+this.x+","+this.y;
       System.out.println(str);
      return str;

   }

}
