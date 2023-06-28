package BaekJoon.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int realPrice = 0;
        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            realPrice += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }
        System.out.println(realPrice == totalPrice ? "Yes" : "No");
    }
}
