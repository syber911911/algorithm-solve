package BaekJoon.Array;

import java.util.Scanner;

public class P10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numbers = new int[201];
        for (int i = 0; i < num; i++) {
            numbers[sc.nextInt()+100]++;
        }
        System.out.println(numbers[sc.nextInt()+100]);
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] numbers = new int[num];
//        for (int i = 0; i < num; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        int targetNum = sc.nextInt();
//        int answer = 0;
//        for (int item : numbers) {
//            if (item == targetNum) answer++;
//        }
//        System.out.println(answer);
    }
}
