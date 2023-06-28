package Codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[19][19];
        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            for(int j = 0; j < 19; j++){
                if(board[row - 1][j] == 0) board[row - 1][j] = 1;
                else board[row - 1][j] = 0;
            }
            for(int j = 0; j < 19; j++){
                if(board[j][column - 1] == 0) board[j][column - 1] = 1;
                else board[j][column -1] = 0;
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