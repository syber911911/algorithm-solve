package BaekJoon.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 1. -1이 입력되면 종료
        // 2. intValue 가 완전수면 intValue = x + y + z 형태로 출력
        // 3. 완전수가 아니면 intValue is NOT Perfect. 형태로 출력
        while (true) {
            sb.setLength(0);
            int sum = 1;
            int intValue = Integer.parseInt(br.readLine());
            if (intValue == -1) break;

            sb.append(intValue).append(" = 1");
            for (int i = 2; i < intValue; i++) {
                if (intValue % i == 0) {
                    sb.append(" + ").append(i);
                    sum += i;
                }
            }
            if (sum == intValue) System.out.println(sb);
            else System.out.println(intValue + " is NOT perfect.");
        }
    }
}
