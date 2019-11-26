package test.javatest.practise5;

public class Price {
    private BookStrategy bookStrategy;

    public Price(BookStrategy bookStrategy){
        this.bookStrategy=bookStrategy;

    }
    public double quote(double price){
        return this.bookStrategy.calcPrice(price);
    }


}
