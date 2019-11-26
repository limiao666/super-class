package test.suanfa;

public class Test {
    private static void testt(int z,A a){
        z=50;
        a.setX(100);

    }
    public static void main(String[] args) {
        int y=20;
        A a=new A();
        testt(y,a);
        System.out.println(y);
        System.out.println(a.getX());
    }
}
