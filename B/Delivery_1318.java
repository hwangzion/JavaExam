package main.Test.test2026_1_2.B;
import java.util.*;
//1318황지온

public class Delivery_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Delivery d1 = new Delivery();
        System.out.print("수령인 : ");
        d1.recipient = sc.nextLine();
        System.out.print("요금 : ");
        d1.setFee(sc.nextInt());
        System.out.print("무게 : ");
        d1.weight = sc.nextInt();
        d1.getInfo();
        System.out.println();
        System.out.print("변경할 요금 : ");
        d1.setFee(sc.nextInt());
        d1.getInfo();
    }
}
class Delivery {
    String recipient;
    int fee;
    int weight;

    public void setFee(int fee){
        if(fee < 0){
            System.out.println("유효하지 않은 요금입니다.");
        }else{
            this.fee = fee;
        }
    }
    public void getInfo(){
        System.out.printf("수령인: %s | 요금: %d원 | 무게: %dkg", recipient, fee, weight);
    }
}
