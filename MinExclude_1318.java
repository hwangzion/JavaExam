package main.Test.test2026_1_2.A;
import java.util.*;
//1318황지온
public class MInExclude_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 개수 : ");
        int num = sc.nextInt();
        double sum = 0;
        double[] arr = new double[num];
        for(int i = 0; i < num; i++){
            System.out.print(i + 1 + "번째 점수 : ");
            arr[i] = sc.nextDouble();
        }
        System.out.print("입력 점수 : ");
        for(int i = 0; i < num; i++){
            System.out.print(arr[i]+ "  ");
        }
        double min = arr[0]; //최솟값
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print("\n제거된 최솟값 : " + min);
        for(int i = 0; i < arr.length; i++){
            if(min != arr[i]){
                sum += arr[i];
            }
        }//최솟값 제외 합계
        System.out.println("\n최솟값 제외 합계 : " + sum);
        System.out.printf("최솟값 제외 평균 : %.2f", sum / (num - 1));
    }
}
