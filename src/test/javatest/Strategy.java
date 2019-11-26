package test.javatest;

public class Strategy {
    public static void main(String[] args) {
        String s1="勇者无敌";
        String s2="勇者无敌";
        String s3=new String(s1);
        boolean b1=s1==s2;
        boolean b3=s1==s3;
        boolean b2=s1.equals(s2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
