package Programmers;

import java.util.Arrays;

public class ArrayAndQueries3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];

            int temp = 0;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        answer = arr;
        return answer;
    }
}
