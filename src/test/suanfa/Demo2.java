package test.suanfa;

import java.util.Scanner;

public class Demo2 {
//    public boolean isUpperCase(char c) {
//
//        return c >=65 && c <= 90;
//
//    }
//    public boolean isLowerCase(char c) {
//
//        return c >=97 && c <= 122;
//
//    }
//    public char toUpper(char c) {
//
//        return Character.isLowerCase(c) ? c : Character.toUpperCase(c);
//
//    }
//    public char toLower(char c) {
//
//        return Character.isUpperCase(c) ? c : Character.toLowerCase(c);
//
//    }
    public static void main(String[] args) {
        System.out.println("请输入数据:");
        Scanner sc=new Scanner(System.in);
        String word=sc.next();

        for(int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if (!Character.isLowerCase(c))
            //   if (!Character.isUpperCase(c))
            {
                word=word.toLowerCase();
            }else{
                word=word.toUpperCase();
            }
        }

        System.out.println("转变后到结果为:"+word);
    }
}
