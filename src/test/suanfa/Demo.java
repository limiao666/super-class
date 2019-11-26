package test.suanfa;

public class Demo {

    public static void main(String[] args) {
//        //斐波那契数列
//        int a = 1;   //定义第一个数
//        int b = 1;   //定义第二个数
//        int c = 0;
//        System.out.print(a + "\t" + b + "\t");
//
//        for (int i = 3; i <= 10; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            System.out.print(c + "\t");
//        }






        //！！！！！！！！！！！！！ 以下是国庆作业！！！！！！！

        //打印三角形
       //     *
       //    ***
       //   *****
       //  *******
//     // *********
//        for(int i=1;i<=5;i++){
//            for(int j=5; i<=j; j--)
//                System.out.print(" ");
//            for(int j=1; j<=i; j++)
//                System.out.print("*");
//            for(int j=1; j<i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//        System.out.println();



// part two 三角形形状
//*
//**
//***
//****
//*****
//******
//*******
//        for(int i=1;i<=7;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




        // ******
        //  ******
        //   ******
        //    ******
        //     ******
        //      ******
//        for(int i=0;i<=5;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int j=5;i<=j;j--){
//                System.out.print("*");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//打印右正三角形
//     *
//    **
//   ***
//  ****
// *****
//        for(int i=1;i<=5;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//     *
//    ***
//   *****
//  *******
// *********
//        for(int i=1;i<=5;i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for(int j=1;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

////
//         ------------*---------------------------
//            for (int i = 1; i <= 5; i++) {
//                for (int j = i; j < 5; j++) {
//                    System.out.print("   ");
//                }
//                //左半部分
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(" * ");
//                }
//                //右半部分
//                for (int j = 1; j < i; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//
//            }



              //*********
              // *******
              //  *****
              //   ***
              //    *
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=5;j>=i;j--){
//                System.out.print("*");
//            }
//           for(int j=4;j>=i;j--){
//               System.out.print("*");
//           }
//
//            System.out.println();
//        }


//                *
//             *     *
//          *           *
//       *                 *
//    *                       * 
// *                             *
//        for(int i = 1; i <= 6; i ++){
//            for(int j = i; j < 6; j ++){
//                System.out.print("   ");
//            }
//            //左半部分
//            for(int j = 1; j <= i; j++){
//                if(j == 1)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            //右半部分
//            for(int j = 1; j < i; j++){
//                if(j == i - 1)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();
//        }

        //100以内的偶数
//        System.out.println("100以内的偶数为:");
//        int sum1=0;
//        for(int i=1;i<=100;i++){
//            if (i%2==0){
//                sum1+=i;
//                //System.out.print(i+"\t");
//            }
//        }
//        System.out.println(sum1);

//        System.out.println();
        //100以内的奇数
       // System.out.println("100以内的奇数为:");
//        int sum2=0;
//        for (int i=1;i<=100;i++){
//            if(i%2==1){
//                sum2+=i;
//               // System.out.print(i+"\t");
//            }
//        }
//
//        System.out.println("1-100以内的奇数之和为:"+sum2);


    }

}
