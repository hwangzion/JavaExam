package main.Test.test2026_1_2.A;
//1318황지온
import java.util.*;

public class Seat_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 크기 : ");
        int size = sc.nextInt();
        String[][] arr = new String[size][size];
        int blank = 0;
        int reservation = 0;

        System.out.println("=== 극장 좌석 예약 시스템 ===");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == 0){
                    arr[i][j] = "[ R ]";
                }else{
                    arr[i][j] = "[ O ]";
                }
                blank++;
            }
        }//자리

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }//자리 출력
        System.out.printf("빈 자리 : %d개 | 예약된 자리 : %d개",blank,reservation);
        System.out.println();

        int select = 0;
        int row = 0; //행
        int col = 0; //열

        while (true) {
            System.out.println();
            System.out.print("1.예약 2.취소 3.현황 4.종료 : "); //메뉴
            select = sc.nextInt();
            if (select == 1) {
                System.out.print("예약할 행 번호 : ");
                row = sc.nextInt();
                System.out.print("예약할 열 번호 : ");
                col = sc.nextInt();
                if (arr[row - 1][col - 1] == "[ X ]") {
                    System.out.print("[오류] 이미 예약된 좌석입니다");
                } else {
                    System.out.printf("%d행 %d열  좌석 예약 완료!", row, col);
                    arr[row - 1][col - 1] = "[ X ]";
                    reservation++;
                    blank--;
                }//1. 예약
            }

            if(select == 2){
                System.out.print("취소할 행 번호 : ");
                row = sc.nextInt();
                System.out.print("취소할 열 번호 : ");
                col = sc.nextInt();
                if(arr[row - 1][col - 1].equals("[ O ]")) {
                    System.out.printf("%d행 %d열  좌석 취소 완료!", row, col);
                    arr[row - 1][col - 1] = "[ O ]";
                    blank++;
                    reservation--;
                }else{
                    System.out.println("[오류] 이미 비어있는 좌석입니다. ");
                }//내용 추가
            }//2.v취소

            if(select == 3){
                System.out.println("=== 극장 좌석 예약 시스템 ===");
                for(int i = 0; i < size; i++){
                    for(int j = 0; j < size; j++) {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
                for(int i = 0; i < size; i++){
                    for(int j = 0; j < size; j++){
                        if(i == 0){
                            arr[i][j] = "[ X ]";
                        }else{
                            arr[i][j] = "[ O ]";
                        }
                    }
                }

                System.out.printf("빈 자리 : %d개 | 예약된 자리 : %d개",blank,reservation);
            }//3. 현황

            if(select == 4){
                System.out.print("프로그램을 종료합니다.");
                break;
            }//4. 종료

            System.out.println();
        }

    }
}
