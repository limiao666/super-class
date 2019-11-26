package test.javatest.practise5;

public class ComputerBookStrategy implements BookStrategy {
    public ComputerBookStrategy(){


    }

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("computer book 10% discount");
        return booksPrice*0.9D;
    }
}
