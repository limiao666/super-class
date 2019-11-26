package test.javatest.practise5;

public class LanguageBookStrategy implements BookStrategy {
    public LanguageBookStrategy(){}

    @Override
    public double calcPrice(double price) {
//        System.out.println("语言类图书 每本有2元的折扣");
        return price-2.0D;
    }
}
