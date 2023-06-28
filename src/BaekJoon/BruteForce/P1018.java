package BaekJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력: N, M 체스판 크기
// 체스판 상태 표시:  boolean[][] 2차원 배열 사용, white == true, black == false
// 검사해야 할 체스판 개수: 2([0][0] --> white or black) * N - 7 * M - 7
// 10 * 10 체스판 이라면 [0-7][0-7], [1-8][0-7], [2-9][0-7]
//                       [0-7][1-8], [1-8][1-8], [2-9][1-8]
//                       [0-7][2-9], [1-8][2-9], [2-9][2-9]
// 64칸 체스판을 white 로 시작하는 체스판을 만드는 최소 비용 + black 로 시작하는 체스판을 만드는 최소 비용 == 64
public class P1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;

        boolean[][] board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String inputColors = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = inputColors.charAt(j) == 'W';
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int count = new P1018().findMin(i, j, board);
                answer = (int) Math.min(count, answer);
            }
        }
        System.out.println(answer);
    }
    public int findMin(int x, int y, boolean[][] board) {
        int count = 0;
        boolean color = board[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 해당 칸이 올바른 색이 아니면 Count++
                if (board[i][j] != color) {
                    count++;
                }
                // 칸이 바뀔 때 옳바른 색상도 변경
                color = !color;
            }
            // 줄이 바뀌면 전 줄의 마지막 옳바른 색이 시작 색상
            color = !color;
        }
        return (int) Math.min(count, 64 - count);
    }
}
