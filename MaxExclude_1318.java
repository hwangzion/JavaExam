package main.Test;
//1318황지온
import java.util.Scanner;

public class MaxExclude_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 개수 : ");
        int num = sc.nextInt();
        double sum = 0;
        double[] arr1 = new double[num];
        for(int i = 0; i < arr1.length; i++){
            System.out.print(i + 1 + "번쨰 점수 : ");
            arr1[i] = sc.nextDouble();
        }
        System.out.print("입력 점수 : ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");

        }
        double min = arr1[0];
        for(int i = 0; i < arr1.length; i++){
            if(min > arr1[i]){
                min = arr1[i];
            }
        }
        System.out.println();
        System.out.print("제거된 최솟값 : " + min);

        double[] arr2 = new double[num];
        for(int i = 0; i < num; i++){
            if(arr1[i] != min){
                arr2[i] += arr1[i];
                sum += arr1[i];
            }
        }
        System.out.println();
        System.out.println("최솟값 제외 합계 : " + sum);
        System.out.printf("최솟값 제외 평균 : %.2f", sum / (num - 1));

    }
}
