package BaekJoon.MathOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int arithmetic = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            if (number % arithmetic < 10) sb.append((char)(number % arithmetic + '0'));
            else sb.append((char)(number % arithmetic - 10 + 'A'));
            number /= arithmetic;
        }
        System.out.println(sb.reverse().toString());
    }
}
