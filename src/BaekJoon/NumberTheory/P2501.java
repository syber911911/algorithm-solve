package BaekJoon.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int intValue = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 1; i <= intValue; i++) {
            if (intValue % i == 0) {
                target--;
            }

            if (target == 0) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
