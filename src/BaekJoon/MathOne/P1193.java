package BaekJoon.MathOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int count = 0;
        int line = 0;

        while (target > count) count += ++line; // 주어진 번호가 속한 행 탐색

        int pre_count = count - line; // 주어진 번호가 속한 행 이전 행의 마지막 번호
        int position = target - pre_count; // 주어진 번호가 속한 행에서의 번호

        if (line % 2 == 0) System.out.printf("%d/%d\n", position, (line + 1) - position);
        else System.out.printf("%d/%d\n", (line + 1) - position, position);
    }
}
