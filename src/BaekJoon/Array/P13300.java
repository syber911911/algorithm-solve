package BaekJoon.Array;

import java.util.Scanner;

public class P13300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt(); //학생 수
        int roomSize = sc.nextInt(); //한 방 최대 인원
        int[][] board = new int[2][7]; // 학생 배정 테이블
        int count = 0;
        for (int i = 0; i < student; i++) {
            board[sc.nextInt()][sc.nextInt()]++;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                count += board[i][j] / roomSize;
                if(board[i][j] % roomSize != 0) count++;
            }
        }
        System.out.println(count);
    }
}
