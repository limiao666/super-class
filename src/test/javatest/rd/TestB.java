package test.javatest.rd;


import java.util.regex.Pattern;

public class TestB{

    public static void main(String[] args) {
       String content="l am noob"+"from runoob.com.";
       String pattern =".*runoob.*";
       boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串是否包含了runoob？"+isMatch);
    }
}

