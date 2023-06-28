package BaekJoon.MathOne;

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        // 1개 -> 7개 -> 19개 -> 37개 ->
        // start -> +6 -> +12 -> +18 ->
        Scanner sc = new Scanner(System.in);
        int inputVal = sc.nextInt();
        int distance = 1; // 거리
        int addrRange = 1; // 주소의 범위

        while (inputVal > addrRange) {
            addrRange += 6 * distance++;
        }
        System.out.println(distance);
    }
}
