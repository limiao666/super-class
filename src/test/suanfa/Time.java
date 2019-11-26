package test.suanfa;

public class Time {
    long second;
    Time(int second){
        this.second=second;
    }
    Time(int minute,int second){
        this.second=minute*60+second;
    }
    Time(int hour,int minute,int second){
        this.second=hour*60*60+minute*60+second;
    }
   public long getSecond(){
        return second;
   }
    public static void main(String[] args) {
        Time time=new Time(30);
        System.out.println(time.getSecond());
        Time time1=new Time(1,30);
        System.out.println(time1.getSecond());
        Time time2=new Time(2,4,54);
        Time time3=new Time(6,33,9);
        time2=time3;
        System.out.println(time2.getSecond());
        System.out.println(time3.getSecond());

    }
}

