package test.javatest.practise5;

public class NovelBookStrategy implements BookStrategy {
    public NovelBookStrategy(){}
    @Override
    public double calcPrice(double price) {
//        System.out.println("小说类图书以每100元有10元的折扣");
        int p = (int) price;
        return price-(double)(p/100*10);
    }
}
