package BaekJoon.MathOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String number = st.nextToken();
        int arithmetic = Integer.parseInt(st.nextToken());
        int answer = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            if ('A' <= number.charAt(i) && number.charAt(i) <= 'Z') {
                answer += (number.charAt(i) - 'A' + 10) * Math.pow(arithmetic, (number.length() - 1 - i));
            } else {
                answer += (number.charAt(i) - '0') * Math.pow(arithmetic, (number.length() - 1 - i));
            }

        }
        System.out.println(answer);
    }
}
