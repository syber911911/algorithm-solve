package Programmers;

import java.util.Arrays;

public class Factorization2 {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1];
        //ArrayList의 contain의 시간복잡도와 array의 0인 인덱스를 제거하는 시간복잡도를 비교하여 풀이 방식 고려
        while(n > 1){
            if(n % divisor == 0){
                arr[divisor] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
