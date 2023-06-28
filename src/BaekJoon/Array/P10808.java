package BaekJoon.Array;

import java.util.Scanner;

public class P10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < inputStr.length(); i++) {
            arr[inputStr.charAt(i) - 'a']++;
        }
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
    }
}
