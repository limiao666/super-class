package test.javatest.jicheng;

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myid){
        name=myName;
        id=myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction(){
        System.out.println("大家好，我是"+id+"号"+name);
    }

    public static void main(String[] args) {
        Penguin pg=new Penguin("小企鹅",3);
        pg.eat();
        pg.introduction();
        pg.sleep();
        Mouse ms=new Mouse("小老鼠",4);
        ms.eat();
        ms.introduction();
        ms.sleep();

    }
}
