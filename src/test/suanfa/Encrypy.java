package test.suanfa;

import java.util.Scanner;

public class Encrypy {
//  定义输入提示数据
    public final static String NUN_ERROR ="数据有误，请重新输入！";
    public final static String NUN_INPUT ="请输入数据：";
    public final static String NUN_OUTPUT ="请输出数据：";
    public final static String NUM_JIEMI ="解密后:";

    public static void main(String[] args) {

        System.out.println(NUN_INPUT);
        Scanner sc_num = new Scanner(System.in);
        String num = sc_num.next();
        if (cheakNum(num)){
            Integer int_num = Integer.parseInt(num);
            System.out.println(NUN_OUTPUT);
            System.out.println(jiaMi(int_num));
            System.out.println(NUM_JIEMI);
            System.out.println(jieMi(jiaMi(int_num)));
        }else {
            System.out.println(NUN_ERROR);
        }
    }
//    加密
    public static Integer jiaMi(Integer num){
//        分离
       int qian = num/1000;
       int bai = num%1000/100;
       int shi = num%100/10;
       int ge = num%10;
//       加5取余
       int new_qian = (qian+5)%10;
       int new_bai = (bai+5)%10;
       int new_shi = (shi+5)%10;
       int new_ge = (ge+5)%10;
//       换位，整理
       String str_num = new_ge+""+new_bai+""+new_shi+""+new_qian;
       return Integer.parseInt(str_num);


    }
//    解密
    public static Integer jieMi(Integer num){
//        分离数据
        int qian = num/1000;
        int bai = num%1000/100;
        int shi = num%100/10;
        int ge = num%10;
//        还原数据
        int new_qian = setNumPlusFive(qian);
        int new_bai = setNumPlusFive(bai);
        int new_shi = setNumPlusFive(shi);
        int new_ge = setNumPlusFive(ge);
        String str_num = new_ge+""+new_bai+""+new_shi+""+new_qian;
        return Integer.parseInt(str_num);
    }
//    判断输入是否是合法数字且小于四位
    public static Boolean cheakNum(String num){
        char[] c_Num = num.toCharArray();
        if (c_Num.length>4) return false;
        for (int i = 0;i<=c_Num.length-1;i++){
            if (c_Num[i]>='0'&&c_Num[i]<='9'){
                return true;
            }
        }
        return false;
    }
//    判断数据是否小于5，是则加5 原理：如 （2+5）%10= 7，但 (7+5)%10 = 2,则规律为 +10-5 则+5
    public static Integer setNumPlusFive(Integer num){
        if (num<5) return num+5;
        return num-5;
    }
}
