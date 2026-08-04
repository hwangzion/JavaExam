package main.Test.test2026_1_2.A;

import java.util.*;

//1318황지온
public class MergeA_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for(int i = 0; i < arr1.length; i++) {
            System.out.print("배열1의 " + i + "번방 입력 : ");
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++) {
            System.out.print("배열2의 " + i + "번방 입력 : ");
            arr2[i] = sc.nextInt();
        }

        System.out.print("배열1 데이터 : ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n배열2 데이터 : ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\n전체 데이터 (오름차순) : ");
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr3.length; i++){
            if(i < 5){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[i - 5];
            }
        }

        for(int i = 0; i < arr3.length - 1; i++){
            int indexMax = i;

            for(int j = i + 1; j < arr3.length; j++){
                if(arr3[j] > indexMax){
                    indexMax = j;
                }
            }
            int temp = arr3[i];
            arr3[i] = arr3[indexMax];
            arr3[indexMax] = temp;
        } //오름차순으로정랼


        Arrays.sort(arr3);

        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        System.out.print("중복 제거된 데이터 : ");
        System.out.print(arr3[0] + " ");
        for(int i = 1; i < arr3.length; i++){
            if(arr3[i] == arr3[i - 1]){
                continue;
            }else {
                System.out.print(arr3[i] + " ");
            }
        }

    }
}
