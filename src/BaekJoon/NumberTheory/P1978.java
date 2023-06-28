package BaekJoon.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numSize = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < numSize; i++) {
            boolean isPrime = true;
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) continue;
            for (int j = 2; j <= (int)Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        System.out.println(count);
    }
}
