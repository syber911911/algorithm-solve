package BaekJoon.ArrayPlanar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paper = Integer.parseInt(br.readLine());
        int count = 0;
        boolean[][] board = new boolean[100][100]; // 각 배열 칸 1개당 1cm -> 종이가 3, 5 부터 시작하면 끝은 3 + 9 = 12, 5 + 9 = 14

        StringTokenizer st;
        for (int i = 0; i < paper; i++) {
            st = new StringTokenizer(br.readLine());
            int xIndex = Integer.parseInt(st.nextToken());
            int yIndex = Integer.parseInt(st.nextToken());

            for (int j = xIndex; j < xIndex + 10; j++) {
                for (int k = yIndex; k < yIndex + 10; k++) {
                    if (!board[j][k]) {
                        board[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
