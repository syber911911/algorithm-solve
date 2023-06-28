package Programmers;

import java.util.Arrays;

public class Unique2DArray1 {
    public static void main(String[] args) {
        int input = 3;
        System.out.println(Arrays.deepToString(solution(input)));
    }
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
