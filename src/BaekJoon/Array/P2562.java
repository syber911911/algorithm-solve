package BaekJoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        int max = 0;

        for (int i = 1; i <= 9; i++) {
            int number = Integer.parseInt(br.readLine());
            if (max < number) {
                max = number;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
