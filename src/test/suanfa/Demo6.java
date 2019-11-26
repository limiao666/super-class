package test.suanfa;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo6 {
    public static void init(int temp[]){
        for(int x=0;x<temp.length;x++){
            temp[x]=x+1;
        }
    }
    public static void reverse(int temp[]){
        int center=temp.length/2; //求出中心点
        int head=0; //表示从前开始计算脚标
        int tail=temp.length-1;  //表示从后开始计算脚标
        for(int x=0; x<center;x++){
            int t=temp[head];
            temp[head]=temp[tail];
            temp[tail]=t;
            head++;
            tail--;
        }
    }
    public static void print(int temp[]){
        for(int x=0;x<temp.length;x++){
            System.out.print(temp[x]+",");
        }
    }



    public static void main(String[] args) {
        int[] data=new int[7];
        init(data);
        print(data);
        System.out.println();
        reverse(data);
        print(data);
//
//                arr[0]0]1,arr[0]1]2,arr[0]2]3,
//                arr[1]0]4,arr[1]1]5,arr[1]2]6,
//                arr[2]0]7,arr[2]1]8,arr[2]2]9,

//        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print("arr["+i+"]"+j+"]"+arr[i][j]+",");
//            }
//            System.out.println();
//        }


//        ArrayList<String> objArray=new ArrayList<String>();
//        objArray.clear();
//        objArray.add(0,"第0个元素");
//        objArray.add(1,"第一个元素");
//        objArray.add(2,"第2个元素");
//        System.out.println("数组删除前:"+objArray);
//        objArray.remove(1);
//        objArray.remove("第0个元素");
//        System.out.println("数组删除后"+objArray);

 // test1
//        int oldArr[]={1,3,5,1,1,6,6,1,5,7,6,7,1,5};
//        List<Integer> newArr = new ArrayList<Integer>();
//        for(int i=0;i<oldArr.length;i++){
//            if(oldArr[i]==1){
//                continue;
//            }else{
//                    newArr.add(oldArr[i]);
//
//            }
//        }
//        System.out.print(newArr);
        




    }
}
