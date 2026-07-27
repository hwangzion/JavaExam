package main.Test.test2026_1_2.B;
//1318황지온
import java.util.*;
public class Gostone_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("바둑판 크기 : ");
        int num = sc.nextInt();
        String [][] bks = new String[num][num];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                bks[i][j] = " . ";
            }
        }//바둑판 크기

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print(bks[i][j]);
            }
            System.out.println();
        }//현황

        int row = 0; //행
        int col = 0; //열
        int menu = 0;
        int w = 0;
        int b = 0;
        while(menu != 4) {
            System.out.print("1.백돌 2.흑돌 3.현황 4.종료 : ");
            menu = sc.nextInt();

            if(menu == 1){
                System.out.print("백돌 놓을 행 번호 : ");
                row = sc.nextInt();
                System.out.print("백돌 놓을 열 번호 : ");
                col = sc.nextInt();

                if(bks[row - 1][col - 1].equals(" . ")) {
                    bks[row - 1][col - 1] = " W ";
                    System.out.println(row + "행 " + col + "열에 백돌(W) 배치 완료!");
                    w++;
                    System.out.println();
                }else{
                    System.out.println("[오류] 이미 돌이 놓인 자리입니다.");
                    System.out.println();
                }
                //백돌 배치
            }//1.벽돌

            if(menu == 2){
                System.out.print("흑돌 놓을 행 번호 : ");
                row = sc.nextInt();
                System.out.print("흑돌 놓을 열 번호 : ");
                col = sc.nextInt();

                if(bks[row - 1][col - 1].equals(" . ")) {
                    bks[row - 1][col - 1] = " B ";
                    System.out.println(row + "행 " + col + "열에 흑돌(B) 배치 완료!");
                    System.out.println();
                    b++;
                }else{
                    System.out.println("[오류] 이미 돌이 놓인 자리입니다.");
                    System.out.println();
                }
                //흑돌 배치
            }//2.흑돌

            if(menu == 3){
                for(int i = 0; i < num; i++){
                    for(int j = 0; j < num; j++){
                        System.out.print(bks[i][j]);
                    }
                    System.out.println();
                }//바둑판

                System.out.printf("백돌 : %d 개 흑돌 : %d개", w, b); //흑백 갯수
                System.out.println();

            }//3.현황

            if(menu == 4){
                System.out.print("프로그램을 종료합니다.");
            }//4.종료
        }
    }
}
