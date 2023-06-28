package BaekJoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] numbers = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[num % 42] = true;
        }

        int count = 0;
        for (boolean item : numbers) {
            if (item) count++;
        }
        System.out.println(count);
    }
}
