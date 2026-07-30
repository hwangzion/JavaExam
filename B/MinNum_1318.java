package main.Test.test2026_1_2.B;
//1318황지온

import java.util.*;

public class MinNum_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("배열의 크기 : ");
        int size = sc.nextInt();
        System.out.printf("%d X %d 배열의 데이터 : ", size, size);
        System.out.println();

        int[][] arr = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                arr[i][j] = rd.nextInt((100) + 1);
            }
        } //2배열에 저장

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("  " + arr[i][j] + " ");
            }
            System.out.println();
        }//데이터 출력

        int min = arr[0][0];
        int row = 0;
        int col = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        } //최솟값
        System.out.println("최솟값 : " + min);
        System.out.printf("최솟값의 위치 : (%d,%d)", row, col);

    }
}
