package Codeup;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] board = new int[19][19];

        for (int i = 0; i < count; i++) {
            int row = sc.nextInt() - 1;
            int column = sc.nextInt() - 1;
            board[row][column] = 1;
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
