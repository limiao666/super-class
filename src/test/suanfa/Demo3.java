package test.suanfa;

import java.util.Scanner;

public class Demo3 {


    public static void main(String[] args) {

        //number 1  10.9
//        for(int i=1;i<=6;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // number 2
//        for(int i=0;i<=5;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int j=7;j>=i;j--){
//                System.out.print("*");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//
//            for(int j=7;i<=j;j--){
//                System.out.print("*");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //number 3
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        double sum=0;
//        double count=0;
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<=i;j++){
//                count+=j;
//            }
//
//        }
//        System.out.println(count);

        //number 4
//        for(int i=1;i<=1000;i++){
//
//            int n2=i%100;
//
//            if(((i*i)==n2)){
//                System.out.println(i);
//
//            }
//        }
//
//        long i,ji,k;k=100;
//        for(i=1;i<=1000;i++) {
//
//            ji=i*i;
//            if((ji%k)==i) {
//
//                System.out.println(i+" "+ji);
//            }
//        }


        //number 5
//        for(int i=1;i<=20;i++){
//            for(int j=1;j<=33;j++){
//               int k=100-i-j;
//               if(5*i+j*3+(1/3)*k==100 && k%3==0){
//                    System.out.println("鸡翁:"+i+"\t"+"鸡母:"+j+"\t"+"鸡雏："+k);
//                }
//            }
//        }


//
//        double i, k;
////        Scanner sc = new Scanner(System.in);
////        System.out.println("请输入一个偶数：");
////        double n = sc.nextDouble();
////        if (n < 6 || n > 2000000000) {
////            System.out.println("输入数不在范围内!");
////        } else {
////
////            for (i = 1; i <= 20; i++) {
////                for (k = 1; k <= 20; k++) {
////                    if (n % 2 == 0) {//获取范围内的偶数
////
////                        if ((i + k == n) && (i % 2 == 1) && (k % 2 == 1) && (i<=k)) {
////                            double multiply_num = i * k;
////
////                             System.out.println(n + "\t" + i + "\t" + k + "\t" + multiply_num);
////
////                        }
////                    }
////                }
////            }
////
////
////        }


//                        Scanner  sc=new Scanner(System.in);
//                        System.out.println("请输入n");
//                        double n=sc.nextDouble();
//                        System.out.println("请输入x");
//                        double x=sc.nextDouble();
//        System.out.println(mysin(n));


        System.out.println(mysin(Math.PI/2));
        System.out.println(mycos(87*(Math.PI/180)));
    }
    public static double j(int n) {
        double muti=1;
        for(int i=1;i<=n;i++) {
            muti *=i;
        }
        return muti;
    }
    public static double mysin(double n) {
        double re=0.0;
        int temp = 1;
        double branch = 0.0;
        for(int i=1 ; ; i=i+2) {
            branch = Math.pow(n,i)/j(i);
            if(temp==1) {
                re += branch;
                temp=0;
            }else {
                re -= branch;
                temp=1;
            }
            if(Math.pow(n,i)/(double)j(i)<0.00001)
                break;
        }
        return re;
    }
    public static double mycos(double n) {
        double re=0.0;
        for(int i = 0; ; i++) {
            re = re+Math.pow(-1, i)*Math.pow(n, 2*i)/(double)j(2*i);
            if(Math.abs(Math.pow(-1, i)*Math.pow(n, 2*i)/j(2*i))<0.00001)
                break;
        }
        return re;

    }
//    public static double mysin(double n){
//        int i;
//        int k=1;
//        double sum=0;
//        for(i=1;i<Math.pow(n,i)/f(i);i+=2){
//            sum+=Math.pow(n,i)/f(i)*k;
//            k=-1*k;
//        }
//        return sum;
//    }

    //sin1=0.8414709848079
//    public static void mysin(double n,double x){
//        double sum=0;
//        for(int i=0;i<=n;i++){
//            double hill=(Math.pow((-1),n)* Math.pow(x,2*n+1))/(2*n+1);
//            sum+=hill;
//            if (Math.abs(hill)<0.000001){
//                break;
//            }
//
//        }
//        System.out.println(sum);
//
//    }
//
//    public static double f(double num){
//        if(1==num){
//            return 1;
//        }
//        return num*f(num-1);
//    }

   } 

