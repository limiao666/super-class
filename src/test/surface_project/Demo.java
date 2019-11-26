package test.surface_project;

import java.util.Scanner;

public class Demo {
    public static String reverse(String s){
        int length=s.length();
        String reverse="";
        for(int i=0;i<length;i++){
            reverse=s.charAt(i)+reverse;

        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        System.out.println("反转后的字符串为:"+reverse(ss));
    }
}
