package Codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;
        int rowIndex = 0;
        int columnIndex = 0;

        int[][] board = new int[9][9];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] > maxValue){
                    maxValue = board[i][j];
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.printf("%d\n", maxValue);
        System.out.printf("%d %d\n", rowIndex + 1, columnIndex + 1);
    }
}
