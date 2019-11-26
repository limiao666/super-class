package test.suanfa;

import java.util.Arrays;
import java.util.Scanner;

public class Demo9 {
     int i;
     static int s;
     public Demo9(){
         i++;
         s++;
     }

    public static void main(String[] args) {
         Demo9 a=new Demo9();
         Demo9 b=new Demo9();
         Demo9 c=new Demo9();
        System.out.println("a.i is"+a.i+"\tb.i is"+b.i+"\tc.i is"+c.i);
        System.out.println("a.i is"+a.s+"\tb.i is"+b.s+"\tc.i is"+c.s);


    }
}
