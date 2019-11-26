package test.suanfa;


import java.util.ArrayList;
import java.util.List;

public class Demo4 {


    public static void main(String[] args) {
        // 第一题
//        for(int i=1;i<=4;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=9;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

        //第二题
//        for(int i=1;i<=5;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//          for(int k=5;k>=i;k--){
//              System.out.print("*");
//          }
//          for(int e=4;e>=i;e--){
//              System.out.print("*");
//          }
//          //右半部分
//           for(int a=0;a<i;a++){
//               System.out.print(" ");
//           }
//           for(int b=5;b>i;b--){
//               System.out.print(" ");
//           }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for(int j=1;j<i;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//
//        }


        //第三题
        for (int i = 1; i <= 6; i++) {
            //上半部分
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j < i; j++) {
                if (j == i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        //打印下半部分
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            System.out.println();
        }



   //第四题
//        for(int i=1;i<=7;i++){
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


    //打印杨辉三角
      //  System.out.println(generate(5));



    }
//    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        if (numRows == 0) {
//            return result;
//        } else if (numRows == 1) {
//            List<Integer> list = new ArrayList<Integer>();
//            list.add(1);
//            result.add(list);
//            return result;
//        } else {
//            result = generate(numRows-1);
//            List<Integer> lastList = result.get(result.size()-1);
//            List<Integer> list = new ArrayList<Integer>();
//            list.add(1);
//            for (int i = 0; i < lastList.size()-1; i++) {
//                list.add(lastList.get(i) + lastList.get(i+1));
//            }
//            list.add(1);
//            result.add(list);
//            return result;
//        }
    }

//    public static List<List<Integer>> generate(int numRows){
//        List<List<Integer>> result=new ArrayList<List<Integer>>();
//        for(int i=0;i<numRows;i++){
//            List<Integer> list=new ArrayList<Integer>();
//            for(int j=0;j<=i;j++){
//                if(j==0 || j==i){
//                    list.add(1);
//                }else{
//                    list.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
//                }
//            }
//            result.add(list);
//        }
//        return result;
//    }
//}
