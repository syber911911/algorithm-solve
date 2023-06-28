package BaekJoon.Array;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exam[] = new int[num];

        for (int i = 0; i < num; i++) {
            exam[i] = sc.nextInt();
        }
        int sum = 0;
        int max = 0;
        for (int score : exam) {
            if (max < score) max = score;
            sum += score;
        }
        // (A / Max * 100 + B / Max * 100 + C / Max * 100) / 3
        // ((A + B + C) / Max * 100) / 3
        // SUM * 100 / MAX / NUM
        System.out.println(sum * 100.0 / max / num);
    }
}
