package test.javatest.practise5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ComputerBookStrategy strategy1 = new ComputerBookStrategy();
        LanguageBookStrategy strategy2 = new LanguageBookStrategy();
        NovelBookStrategy strategy3 = new NovelBookStrategy();
        double quote=0.0D; //�����ܼ�;
        Scanner sc=new Scanner(System.in);
        double bPrice;
        Price price;
        double zPrice;
        //���þ�����Լ���������ͼ��ļ�Ǯ
        System.out.println("please enter the price of computer books");
        bPrice=sc.nextDouble();
        price=new Price(strategy1);
        zPrice = price.quote(bPrice);
        System.out.println("Prime Price: " + bPrice + ", Discount Price: " + zPrice);
        System.out.println();
        quote += zPrice; // �ۼ��ܼ�
        // ���þ�����Լ������������ͼ��ļ�Ǯ
        System.out.println("Please enter the price of Language books. ");
        bPrice = sc.nextDouble();
        price = new Price(strategy2);
        zPrice = price.quote(bPrice);
        System.out.println("Prime Price: " + bPrice + ", Discount Price: " + zPrice);
        System.out.println();
        quote += zPrice; // �ۼ��ܼ�
        // ���þ�����Լ���С˵��ͼ��ļ�Ǯ
        System.out.println("Please enter the price of Novel books. ");
        bPrice = sc.nextDouble();
        price = new Price(strategy3);
        zPrice = price.quote(bPrice);
        System.out.println("Prime Price: " + bPrice + ", Discount Price: " + zPrice);
        System.out.println();
        quote += zPrice; // �ۼ��ܼ�
        System.out.println("Total: " + quote); // ����ܼ�
        return;

    }
}
