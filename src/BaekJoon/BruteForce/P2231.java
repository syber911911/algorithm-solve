package BaekJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nString = br.readLine();
        int nLength = nString.length();
        int n = Integer.parseInt(nString);
        int result = 0;

        // 생성자가 될 수 있는 수의 최소 값은 분해합 - 각 자리수의 최대 값인 9 * 수의 길이
        for (int i = n - nLength * 9; i < n; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
