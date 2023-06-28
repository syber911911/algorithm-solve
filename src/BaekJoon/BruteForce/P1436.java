package BaekJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int target = 666;

        while (count != N) {
            target++;

            if (String.valueOf(target).contains("666")) count++;
        }
        System.out.println(target);
    }
}
