package test.javatest.practise5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ComputerBookStrategy strategy1 = new ComputerBookStrategy();
        LanguageBookStrategy strategy2 = new LanguageBookStrategy();
        NovelBookStrategy strategy3 = new NovelBookStrategy();
        double quote=0.0D; //计算总价;
        Scanner sc=new Scanner(System.in);
        double bPrice;
        Price price;
        double zPrice;
        //调用具体策略计算计算机类图书的价钱
        System.out.println("please enter the price of computer books");
        bPrice=sc.nextDouble();
        price=new Price(strategy1);
        zPrice = price.quote(bPrice);
        System.out.println("Prime Price: " + bPrice + ", Discount Price: " + zPrice);
        System.out.println();
        quote += zPrice; // 累计总价
        // 调用具体策略计算语言类机类图书的价钱
        System.out.println("Please enter the price of Language books. ");
        bPrice = sc.nextDouble();
        price = new Price(strategy2);
        zPrice = price.quote(bPrice);
        System.out.println("Prime Price: " + bPrice + ", Discount Price: " + zPrice);
        System.out.println();
        quote += zPrice; // 累计总价
        // 调用具体策略计算小说类图书的价钱
        System.out.println("Please enter the price of Novel books. ");
        bPrice = sc.nextDouble();
        price = new Price(strategy3);
        zPrice = price.quote(bPrice);
        System.out.println("Prime Price: " + bPrice + ", Discount Price: " + zPrice);
        System.out.println();
        quote += zPrice; // 累计总价
        System.out.println("Total: " + quote); // 输出总价
        return;

    }
}
