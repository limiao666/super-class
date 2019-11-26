package test.javatest;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //对于像数组这种非普通的数据类型，当使用赋值的时候，
        // 相当于将对象的地址拷贝，所以修改任何一个其他都会跟着改变
        int[] a={10,20,30,40};
        int[][]b={{1,2},{4,5,6,7}};

//        for(int i=0;i<b.length;i++){
//            System.out.println(Arrays.toString(b[i]));
//        }
        b[0]=a;
//        System.out.println(Arrays.toString(b[0]));
//        System.out.println(b[0][0]);
                for(int i=0;i<b.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }
        System.out.println();
        System.out.println("初始的a:"+Arrays.toString(a));
        System.out.println();
        b[0][1]=b[1][3];
        for(int i=0;i<b.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }
        System.out.println("最后的a:"+Arrays.toString(a));
        System.out.println(b[0][3]);
        System.out.println(a[1]);
    }
}
