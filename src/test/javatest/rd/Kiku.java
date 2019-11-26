package test.javatest.rd;

public class Kiku {
   public  void max(double[] nums){
       double max=nums[0];
       int index=0;
       for(int i=0;i<nums.length;i++){
           if (max<nums[i]){
               max=nums[i];
               index=i;
           }
       }
       System.out.println("最大的实数是："+max+" 下标是:"+index);

   }

    public static void main(String[] args) {
        double[] nums={1.0, 4.4, 6.6,2.3};
        Kiku kiku=new Kiku();
        kiku.max(nums);
    }

}
