package test.suanfa;

import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        System.out.println("enter a num:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int [][]ss = new int[num][num];//例如8行杨辉三角，将数存入二维数组再输出
        ss[0][0] = ss[1][0] = ss[1][1] = 1;//第一行第二行都是1
        for(int i=0;i<num;i++) {
            ss[i][0]=ss[i][i]=1;//每一行的第一个及最后一个是1
            for(int j=1;j<i;j++) { //
                ss[i][j] = ss[i-1][j-1] + ss[i-1][j];
            }
            for(int j=0;j<num-i;j++) {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print(ss[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
