package test.javatest;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //�������������ַ���ͨ���������ͣ���ʹ�ø�ֵ��ʱ��
        // �൱�ڽ�����ĵ�ַ�����������޸��κ�һ������������Ÿı�
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
        System.out.println("��ʼ��a:"+Arrays.toString(a));
        System.out.println();
        b[0][1]=b[1][3];
        for(int i=0;i<b.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }
        System.out.println("����a:"+Arrays.toString(a));
        System.out.println(b[0][3]);
        System.out.println(a[1]);
    }
}
