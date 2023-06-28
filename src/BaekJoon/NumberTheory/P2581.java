package BaekJoon.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int startNum = Integer.parseInt(br.readLine());
        int endNum = Integer.parseInt(br.readLine());
        int minNum = 10000;
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            boolean isPrime = true;
            if (i == 1) continue;
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                if (minNum > i) minNum = i;
            }
        }
        System.out.println(sum == 0 ? -1 : sum + "\n" + minNum);
        System.out.println(0 % 2);
    }
}
