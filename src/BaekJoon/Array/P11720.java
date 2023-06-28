package BaekJoon.Array;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String strNum = sc.next();
        char[] chNum = strNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < chNum.length; i++) {
            sum += chNum[i] - '0';
        }
        System.out.println(sum);
    }
}

