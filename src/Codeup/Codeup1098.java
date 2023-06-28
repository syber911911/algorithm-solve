package Codeup;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[sc.nextInt()][sc.nextInt()];
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int l = sc.nextInt(); // 막대의 길이
            int d = sc.nextInt(); // 막대의 방향 가로: 0, 세로: 1
            int x = sc.nextInt() - 1; // x좌표
            int y = sc.nextInt() - 1; // y좌표
            // 좌표평면과 배열은 회전 관계, 좌표평면에서 0,0을 배열의 0,0과 맞추려면 회전이 필요
            // 좌표평면에서의 x축은 배열에서 row index(세로축), y축은 column index(가로축)을 나타낸다.
            while (l > 0) {
                board[x][y] = 1;
                if (d == 0) y++;
                else x++;
                l--;
            }
        }
        printBoard(board);
    }
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int column : row) {
                System.out.printf("%d ", column);
            }
            System.out.printf("\n");
        }
    }
}
