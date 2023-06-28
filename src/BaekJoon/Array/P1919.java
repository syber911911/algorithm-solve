package BaekJoon.Array;

import java.util.Scanner;

public class P1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][26];
        int answer = 0;
        for (int i = 0; i < 2; i++) {
            for (char item : sc.nextLine().toCharArray()) {
                arr[i][item - 'a']++;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            answer += Math.abs(arr[0][i] - arr[1][i]);
        }
        System.out.println(answer);
    }
}
