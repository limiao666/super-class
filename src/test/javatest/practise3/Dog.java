package test.javatest.practise3;

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("汪汪...汪汪");
    }

    @Override
    public String getAnimalName() {
        return "狗";
    }
}
