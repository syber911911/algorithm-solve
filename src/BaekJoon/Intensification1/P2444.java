package BaekJoon.Intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            sb.append(" ".repeat(height - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        for (int i = height - 1; i >= 1; i--) {
            sb.append(" ".repeat(height - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
