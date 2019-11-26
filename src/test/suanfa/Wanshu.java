package test.suanfa;

public class Wanshu {
    public static void main(String[] args) {

        System.out.println("1-1000以内的完数：");
         int i,j;
         for(i=1;i<=1000;i++){
             int sum=0;
             for(j=1;j<i;j++){
                 if(i%j==0){
                     sum=sum+j;

                  }
             }
             if(i==sum){
                 System.out.print(i+" ");
             }
         }
    }
}
