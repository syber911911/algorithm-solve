package BaekJoon.Array;

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
        int[] answer = new int[10];
        while (num > 0) {
            answer[num % 10]++;
            num /= 10;
        }
        for (int item : answer) {
            System.out.println(item);
        }
    }
}
