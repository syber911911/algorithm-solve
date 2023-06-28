package BaekJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while (N > 2) {
            if (N % 5 != 0) {
                N -= 3;
                count++;
            } else {
                count += N / 5;
                N = 0;
            }
        }
        System.out.println(N == 0 ? count : -1);
    }
}
