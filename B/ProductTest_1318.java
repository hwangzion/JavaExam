package main.Test.test2026_1_2.B;
import java.util.*;
//1318황지온
public class ProductTest_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("상품" + (i + 1) + " 구분 : ");
            String type = sc.next();

            System.out.print("상품" + (i + 1) + " 상품명 : ");
            String name = sc.next();

            System.out.print("상품" + (i + 1) + " 재고량 : ");
            int stock = sc.nextInt();

            System.out.print("상품" + (i + 1) + " 단가 : ");
            int price = sc.nextInt();

            p[i] = new Product(type, name, stock, price);
        }

        System.out.println("---------------------------------");
        System.out.println("구분\t상품명\t재고량\t단가");

        int total = 0;
        for (int i = 0; i < 5; i++) {
            p[i].print();
            total += p[i].stock;
        }

        System.out.println("-------------------------------------");
        System.out.println("상품의 총 재고량 : " + total);
    }
}

class Product {
    String type;
    String name;
    int stock;
    int price;

    Product(String type, String name, int stock, int price) {
        this.type = type;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    void print() {
        System.out.println(type + "\t" + name + "\t" + stock + "\t" + price);
    }
}
