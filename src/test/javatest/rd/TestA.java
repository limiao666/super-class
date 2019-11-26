package test.javatest.rd;

import java.applet.Applet;


public class TestA  extends Applet {

    // test for welcome

//    public static void main(String args[]) {
//        String a = "*";
//        for (int i = 0; i < 18; i++) {
//            System.out.print(a);
//        }
//        System.out.println();
//        for (int i = 0; i < 3; i++) {
//            System.out.print("");
//        }
//        System.out.println("Welcome");
//        for (int i = 0; i < 18; i++) {
//            System.out.print(a);
//        }
//    }


//  test for applet

//        public static void main(String[] args) {
//            String b= "*";
//            for(int j=0;j<18;j++){
//                System.out.print(b);
//            }
//            System.out.println();
//            for (int j=0;j<3;j++){
//                System.out.print("");
//            }
//            System.out.println("Applet");
//            for (int j=0;j<18;j++){
//                System.out.print(b);
//            }
//
//        }


   //test for (1+..+100)
//   public static void main(String[] args) {
//
//       int sum=0;
//       for(int i=1;i<=100;i++){
//           int temp=0;
//           for (int j=1;j<=i;j++){
//               temp+=j;
//           }
//           sum+=temp;
//
//       }
//       System.out.println(sum);
//   }


    // 百鸡问题
//    public static void main(String[] args) {
//        int x,y,z;
//        for (x=0;x<=20;x++){
//            if((100-7*x)%4==0){
//                y=(100-7*x)/4;
//                if(y>=0){
//                    z=100-x-y;
//                    if(z>=0){
//                        System.out.println("公鸡数："+x+"母鸡数："+y+"小鸡数："+z);
//
//                    }
//                }
//            }
//        }
//    }




    // **********以下是作业二*************

    //1.字符串翻转
//    public static void main(String[] args) {
//        String str="limiao";
//        for(int i=str.length()-1;i>=0;i--){
//            char c=str.charAt(i);
//            System.out.print(c);
//        }
//    }


    //2.50！
//    public static void main(String[] args) {
//        int i=1;
//        double sum=1.0;
//        do {
//            sum=sum*i;
//            i++;
//
//        }while (i<=50);
//        System.out.println("50!="+sum);
//    }


    //1!+2!+...+10!
//    public static void main(String[] args) {
//        int sum = 0, fact;
//        for (int n = 1; n <= 10; n++) {
//            fact = 1;
//            for (int i = 1; i <= n; i++)
//                fact *= i;
//            sum += fact;
//        }
//        System.out.println("sum=" + sum);
//    }


    //switch，break输出每个月的天气
//    public static void main(String[] args) {
//        for (int month=1;month<=12;month++) {
//            switch (month) {
//                case 2:
//                    System.out.println(month + "月有" + 28 + "天");
//                    break;
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    System.out.println(month + "月有" + 31 + "天");
//                    break;
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    System.out.println(month + "月有" + 30 + "天");
//                    break;
//            }
//        }
//    }


    //0~500之间被7整除的数之和  continue;
//    public static void main(String[] args) {
//        int sum=0;
//        for (int i=0;i<=500;i++){
//            if (i%7!=0){
//                continue;
//            }else {
//               // System.out.print(i+" ");
//                sum+=i;
//            }
//        }
//        System.out.println("0~500之间被7整除的数之和为："+sum);
//    }
//


    //选择排序
//    public static void main(String[] args) {
//        int a[] = {20, 10, 50, 40, 30, 70, 60, 80, 90, 100};
//        int i, n, max;
//        for (i = 0; i <= 8; i++) {
//            for (n = i + 1; n <= 9; n++) {
//                if (a[i] < a[n]) {
//                    max = a[i];
//                    a[i] = a[n];
//                    a[n] = max;
//
//                }
//
//            }
//        }
//
//        for(i=0;i<=9;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//
//    }

//    public static void main(String[] args) {
//        int r = 6;
//        // 定义y为圆的纵坐标,其中y=y+2是让设置纵坐标的步长，可以调整椭圆的“胖瘦”
//        for (int y = 0; y <= 2 * r; y = y + 2) {
//            long x = Math.round(r - Math.sqrt(2 * r * y - y * y));
//            for (int i = 0; i <= 2 * r; i++) {
//                // i==x是指某一个纵坐标对应的一个横坐标，i==2*r-x 是指该纵坐标对应的第二个横坐标
//                if (i == x || i == 2 * r - x) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }
    //}
//    public  void paint(Graphics g)
//    {
//        for(double angle=0;angle<2*Math.PI;)//周长为零 周长小于2π
//        {
//            g.drawString("*", (60+(int)(50*Math.sin(angle))), 70+(int)(50*Math.cos(angle)));
////画图 这里是参数方程 x=a+rcosθ  y=b+rsinθ
//            angle+=(Math.PI/20.0);//Math.PI 圆周率 这里是打印多少个* 
//        }
//    }


    //递归10！
//    public static int fac(int num){
//        if(num==1){
//            return 1;
//        }else{
//            return num*fac((num-1));
//        }
//    }
//
//    public static void main(String[] args) {
//        int num=fac(10);
//        System.out.println(num);
//    }






}







