package test.javatest.jicheng;

import java.util.Scanner;

public class Circle {
    final static double PI=3.14;
    Scanner sc=new Scanner(System.in);
    private double rs=1;
    public Circle(double radius){
        rs=radius;
    }
    //圆面积
    public double Area(){
        double area;
        area=PI*rs*rs;
        return area;
    }
    //圆周长
    public double Perimeter(){
        double perimeter;
        perimeter=2*PI*rs;
        return perimeter;
    }
}
