package BaekJoon.MathOne;

import java.util.Scanner;

public class P2903 {
    public static void main(String[] args) {
        // 초기: 2의 제곱 -> 1회: 3의 제곱 -> 2회: 5의 제곱 -> 3회: 9의 제곱 ->
        // 점 두개 변이 2번 나타남 -> 점 세개 변이 3번 나타남 -> 점 다섯개 변이 5번 나타남
        // start -> +1 -> +2 -> +4 -> +8  : 2의 제곱으로 늘어남
        Scanner sc = new Scanner(System.in);
        int loopSize = sc.nextInt();
        int targetNum = 2;

        for (int i = 0; i < loopSize; i++) {
            targetNum += (int)Math.pow(2, i);
        }
        System.out.println((int)Math.pow(targetNum, 2));
    }
}
