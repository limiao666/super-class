package test.javatest.jiekou;

public class AnimalTest implements Animal{

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void travle() {
        System.out.println("玩");
    }

    public static void main(String[] args) {
        AnimalTest at=new AnimalTest();
        at.eat();
        at.travle();
    }
}
