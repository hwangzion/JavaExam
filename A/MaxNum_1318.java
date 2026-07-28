package main.Test.test2026_1_2.A;
//1318황지온
import java.util.*;

public class MaxNum_1318 {
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

        int max = arr[0][0];
        int row = 0;
        int col = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        } //최댓값
        System.out.println("최댓값 : " + max);
        System.out.printf("최댓값의 위치 : (%d,%d)", row, col);

    }
}
