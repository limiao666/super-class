package test.suanfa;

import java.util.Scanner;

public class Demo1 {


    public static void main(String[] args) {

        //银行利率
        int num=10000;

        double year1=num+num*0.0035;   //第一年的钱总和
        double year2=year1*0.015+year1;  //第二年钱总和
        double year3 =year2*0.021+year2;
        double year4=year3*0.021+year3;
        double year5=year4*0.021+year4;
        double year6=year5*0.021+year5;
        System.out.println("一万块钱放在银行六年后的钱数为:"+year6);




        //数字加密
//        System.out.println("请输入一个四位数:");
//        Scanner sc=new Scanner(System.in);
//        int number1=sc.nextInt();
//        int a =(number1/1000+5)%10;
//        int b = ((number1 % 1000) / 100 + 5) % 10;
//        int c = ((number1 % 100) / 10 + 5) % 10;
//        int d = ((number1 % 10) + 5) % 10;
//        int number2 = d * 1000 + c * 100 + b * 10 + a;
//        System.out.println("加密后的四位数是:");
//        System.out.println(number2);
    }
}
