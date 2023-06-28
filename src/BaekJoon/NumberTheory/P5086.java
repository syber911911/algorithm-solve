package BaekJoon.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());

            int intValue1 = Integer.parseInt(st.nextToken());
            int intValue2 = Integer.parseInt(st.nextToken());

            if (intValue1 == 0 && intValue2 == 0) return;

            if (intValue2 % intValue1 == 0) {
                System.out.println("factor");
            } else if (intValue1 % intValue2 == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
