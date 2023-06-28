package BaekJoon.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println(result);
        //System.out.println(sumOfNum(num));
    }
    public static int sumOfNum(int inputNum) {
        if(inputNum == 1) return inputNum;
        return inputNum + sumOfNum(inputNum - 1);
    }
}
