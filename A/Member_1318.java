package main.Test.test2026_1_2.A;
import java.util.*;
//1318황지온
public class Member_1318 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        member m1 = new member();
        System.out.print("이름 : ");
        m1.name = sc.nextLine();
        System.out.print("나이 : ");
        m1.setAge(sc.nextInt());
        System.out.print("포인트 : ");
        m1.point = sc.nextInt();
        m1.getInfo();
        System.out.println();
        System.out.print("변경할 나이 : ");
        m1.setAge(sc.nextInt());
        m1.getInfo();
    }
}

class member {
    String name;
    int age;
    int point;

    public void setAge(int age){
        if(age < 0){
            System.out.println("유효하지 않은 나이입니다.");
        }else{
            this.age = age;
        }
    }
    public void getInfo(){
        System.out.printf("이름: %s | 나이: %d세 | 포인트: %d", name, age, point);
    }

}