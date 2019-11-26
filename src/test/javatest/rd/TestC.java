package test.javatest.rd;

public class TestC {

    public static void main(String[] args) throws Exception {

        System.out.println("输入一个字符:");
        char i=(char)System.in.read();
        int i_ascii=Integer.valueOf(i);
        if (i_ascii>=48 && i_ascii<=57){
            System.out.println(i);
        }else{
            System.out.println("此字符串超出范围");
        }

    }
}

