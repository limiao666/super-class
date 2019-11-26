package test.javatest.practise3;

public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("喵喵...喵喵");
    }

    @Override
    public String getAnimalName() {
        return "猫";
    }
}
