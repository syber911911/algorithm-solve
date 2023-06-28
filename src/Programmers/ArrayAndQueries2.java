package Programmers;

import java.util.Arrays;

public class ArrayAndQueries2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;

        for(int[] query : queries) {
            int min = Integer.MAX_VALUE;
            for(int i = query[0]; i <= query[1]; i++) {
                if(arr[i] > query[2] && arr[i] < min) {
                    min = arr[i];
                }
            }
            if(min == Integer.MAX_VALUE){
                answer[index] = -1;
            } else {
                answer[index] = min;
            }
            index++;
        }
        return answer;
    }
}
