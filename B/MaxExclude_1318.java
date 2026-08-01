package main.Test.test2026_1_2.B;

import java.util.Scanner;

public class MaxExclude_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 개수 : ");
        int num = sc.nextInt();
        double[] scores = new double[num];
        for(int i = 0; i < num; i++){
            System.out.print(i + 1 + "번째 점수 : ");
            scores[i] = sc.nextDouble();
        }
        System.out.print("입력 정수 : ");
        for(double score : scores){
            System.out.print(score + " ");
        }
        double MAX = scores[0];
        double sum = 0;

        for(int i = 0; i < num; i++) {
            if (MAX < scores[i]) {
                MAX = scores[i];
                sum += scores[i];
            }else{
                sum += scores[i];
            }
        }

        System.out.println();
        System.out.println("제거된 최고점 : " + MAX);
        System.out.println("최고점 제외 합계 : " + (sum - MAX));
        System.out.printf("최고점 제외 평균 : %.2f", (sum - MAX) / (num - 1)); //최고점을 제외해서 num - 1
    }
}
